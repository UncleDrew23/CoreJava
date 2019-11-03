import java.time.LocalDate;

/**
 * @program: EmployeeTest
 * @description: 用户自定义类
 * @author: ycbron
 * @create: 2019-11-03 23:10
 **/

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Cracker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for(Employee e: staff)
        {
            e.raiseSalary(5);
        }

        for(Employee e: staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDays=" + e.getHireDay());
        }
    }
}

class Employee
{
    // instance fields
    // final 实例域 构建对象时必须初始化这样的域，这个值不会被修改
    private final String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // method
    public String getName()
    {
        // 关键词 this ：隐式参数
//        return this.name;
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}