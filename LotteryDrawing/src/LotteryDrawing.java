import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: LotteryDrawing
 * @description: 数组排序
 * @author: ycbron
 * @create: 2019-11-03 00:05
 **/

public class LotteryDrawing {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++){
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }

        // 数组排序
        Arrays.sort(result);
        for(int r : result){
            System.out.println(r);
        }

        // 打印数组中的所有值
        System.out.println(Arrays.toString(result));

        // 数组拷贝
        int[] result1 = Arrays.copyOf(result,result.length - 1);
        int[] result2 = Arrays.copyOfRange(result, 0, result.length - 2);

        // 二分搜索
        int index = Arrays.binarySearch(numbers, 23);
        int index1 = Arrays.binarySearch(numbers,6,24,23);

        // 将数组的所有数据元素值设置为同一个值
        Arrays.fill(result2,23);

        // 判断数组是否相等
        boolean flag = Arrays.equals(result1,result2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(index);
        System.out.println(index1);
        System.out.println(Arrays.toString(result2));
        System.out.println(flag);
    }
}
