package clone;

/**
 * @program clone
 * @description: 实现 Cloneable 接口
 * @author: ycbron
 * @create: 2020/05/01 23:29
 */

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        // 调用 Object 类中的 clone 方法
        Employee cloned = (Employee) super.clone();
        // 克隆可变子对象， Date 类实现了 Cloneable 接口
        cloned.hireDay = (Date) hireDay.clone();
        return  cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
