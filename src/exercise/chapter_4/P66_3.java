package exercise.chapter_4;

import java.util.Random;

/**
 * 练习3. 修改练习2， 把代码用一个无限循环包括起来。然后运行它直至用键盘中断其运行
 *          （通常是通过按Ctrl-c）
 */
public class P66_3 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            if(a > b)
                System.out.println(a + " > " + b);
            else if (a < b)
                System.out.println(a + " < " + b);
            else
                System.out.println(a + " = " + b);
        }
    }
}