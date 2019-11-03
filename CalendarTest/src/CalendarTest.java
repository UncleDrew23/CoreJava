import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @program: CalendarTest
 * @description: 使用预定义类
 * @author: ycbron
 * @create: 2019-11-03 17:33
 **/

public class CalendarTest {
    public static void main(String[] args){
        // 构造一个当前日期的对象
        LocalDate date = LocalDate.now();
        // 构造一个给定日期的对象
//        LocalDate date = LocalDate.of(2020,1,3);

        // 得到当前日期的月、日
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // 生成当前日期之前 today - 1 天的日期
        date = date.minusDays(today - 1);

        // 得到当前日期是星期几
        DayOfWeek weekdays = date.getDayOfWeek();
        int value = weekdays.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < value; i++){
            System.out.print("    ");
        }

        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            // 生成当前日期之后 1 天的日期
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
    }
}
