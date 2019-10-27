/**
 * @program: InputTest
 * @description: 读取输入
 * @author: ycbron
 * @create: 2019-10-27 19:53
 **/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class InputTest {
    public static void main(String[] args) throws IOException
    {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("What is your name? ");
//        String name = in.nextLine();
//
//        System.out.println("How old are you? ");
//        int age = in.nextInt();
//
//        System.out.println("Hello, " + name + ", next year, you'll be " + (age + 1));
        System.out.printf("%tc",new Date());
        PrintWriter out = new PrintWriter("myfile.txt");
        out.println("my first txt, hahaha !");
        out.close();
    }
}