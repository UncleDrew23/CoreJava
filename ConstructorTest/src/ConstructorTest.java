import java.util.Random;

/**
 * @program: ConstructorTest
 * @description: 对象构造
 * @author: ycbron
 * @create: 2019-11-05 23:50
 **/

public class ConstructorTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for(Employee e: staff)
        {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee
{
    private static int nextId;

    private int id;
    // 在声明中赋值
    private String name = "";
    private double salary;

    // 静态初始化块
    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    // 重载 constructors
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        // 调用 Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // 默认 constructor
    public Employee()
    {

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
}