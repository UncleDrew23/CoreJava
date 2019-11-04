/**
 * @program: StaticTest
 * @description: 静态域与静态方法
 * @author: ycbron
 * @create: 2019-11-04 22:59
 **/

public class StaticTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry",65000);

//        System.out.println("Next available id=" + Employee.getNextId());
        
        for(Employee e: staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        // 调用静态方法
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class Employee
{
    // 静态域
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    // 静态方法
    public static int getNextId()
    {
        return nextId;
    }

    public static void main(String[] args)
    {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}