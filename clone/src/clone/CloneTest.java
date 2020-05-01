package clone;

/**
 * @program clone
 * @description: 对象克隆
 * @author: ycbron
 * @create: 2020/05/01 23:48
 */
public class CloneTest {
    public static void main(String[] args){
        try{
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
