package exercise.chapter_4;

import java.util.Random;

/**
 * 练习2. 写一个程序，产生25个int类型的随机数。对于每一个随机值，使用if-else语句来将其分类为
 *        大于、小于，或等于紧随它而随机生成的值。
 */
public class P66_2 {
    public static void main(String[] args) {
        int[] ints = getRandom(25);
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length-1) {
                System.out.println("该随机数为最后一个.值为:" + ints[i]);
                break;
            }
            compare(ints[i], ints[i + 1]);
        }
    }

    /**
     * 比较随机数的大小
     * @param a 前一个随机数
     * @param b 紧接着生成的下一个随机数
     */
    private static void compare(int a, int b) {
        if (a > b) {
            System.out.println("随机数"+ a + " 大于 随机数" + b);
        } else if(a < b) {
            System.out.println("随机数"+ a + " 小于 随机数" + b);
        } else {
            System.out.println("随机数"+ a + " 等于 随机数" + b);
        }
    }

    /**
     * 随机生成指定个数的随机数数组，并返回该数组.
     * @param count 要生成的随机数组的长度
     * @return 随机数组
     */
    private static int[] getRandom(int count) {
        Random random = new Random();
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = random.nextInt(100);
        }
        return ints;
    }
}