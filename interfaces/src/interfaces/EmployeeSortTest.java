package interfaces;

import java.util.*;

/**
 * @program interfaces
 * @description: Employee 类排序
 * @author: ycbron
 * @create: 2020/05/01 21:47
 */
public class EmployeeSortTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        // static void sort(Object[] a)  对数组 a 进行排序， 要求数组中的元素必须属于实现了 Comparable 接口的类，并且元素之间必须是可比较的。
        Arrays.sort(staff);

        for(Employee e: staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
