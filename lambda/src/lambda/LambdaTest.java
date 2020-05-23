package lambda;

import java.lang.reflect.Array;
import java.util.*;

import javax.swing.*;

import javax.swing.Timer;

/**
 * @program lambda
 * @description: the use of lambda expressions
 * @author: ycbron
 * @create: 2020/05/23 09:55
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = new String[] {"Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by length:");
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
