/**
 * @program: PackageTest
 * @description: 包
 * @author: ycbron
 * @create: 2019-11-07 22:52
 **/
import com.horstmann.corejava.*;
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args)
    {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);

        // 静态导入
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
