package objectAnalyzer;

import java.util.ArrayList;

/**
 * @program: objectAnalyzer
 * @description: TODO
 * @author: ycbron
 * @create: 2021-06-13 15:43
 **/
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
