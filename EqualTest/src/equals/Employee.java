package equals;
import java.time.*;
import java.util.Objects;

/**
 * @program EqualTest
 * @description: Employee 类
 * @author: ycbron
 * @create: 2020/04/19 16:37
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * equals 方法
     * @param otherObject
     * @return
     */
    public boolean equals(Object otherObject)
    {
        // 检测 this 与 otherObject 是否引用同一个对象
        if(this == otherObject)
        {
            return true;
        }
        //检测 otherObject 是否为null
        if(otherObject == null)
        {
            return  false;
        }
        //this 和 otherObject 是否属于同一个类
        if(getClass() != otherObject.getClass())
        {
            return false;
        }
        //将 otherObject 转换为相应的类类型变量
        Employee other = (Employee) otherObject;
        //对所有需要比较的域进行比较。使用 == 比较基本类型域，使用 equals 比较对象域。
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * hashCode 方法
     * @return
     */
    public int hashCode()
    {
        return  Objects.hash(name, salary, hireDay);
    }

    /**
     * toString 方法
     * @return
     */
    public String toString()
    {
        return getClass() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
