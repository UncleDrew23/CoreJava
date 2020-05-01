package timer;

/**
 * @program timer
 * @description: 接口与回调 callback
 * @author: ycbron
 * @create: 2020/05/01 22:45
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        // 构造定时器对象 timer 去 调用 监听器对象 listener
        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
