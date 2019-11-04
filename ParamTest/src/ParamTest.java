/**
 * @program: ParamTest
 * @description: 方法参数
 * @author: ycbron
 * @create: 2019-11-04 23:44
 **/

public class ParamTest {
    public static void main(String[] args)
    {
        // 一个方法不能修改一个基本数据类型的参数
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
//        ParamTest.tripleValue(percent);
        System.out.println("After: percent=" + percent);

        // 一个方法可以改变一个对象参数的状态
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: percent=" + harry.getSalary());
        tripleSalary(harry);
//        ParamTest.tripleSalary(harry);
        System.out.println("After: percent=" + harry.getSalary());

        // 一个方法不能让一个对象参数引用一个新的对象
        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
//        ParamTest.swap(a,b);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
    }

    public static void tripleValue(double x)
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x)
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee
{
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


}