package exercise.chapter_4;

/**
 * 练习4
 * 写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数（只能被其自身和1整除
 * 而不能被其他数字整出的整数)
 */
public class P66_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            int factors = 0;
            for (int j = 1; j < (i + 2) >> 2; j++) {
                if ((i % j) == 0) {
                    factors++;
                }
            }
            if (factors < 2) {
                System.out.println(i + " is prime");
            }
        }
    }
}