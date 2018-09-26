package exercise.chapter_3;

import java.util.Random;

/**
 * 练习7.
 *  编写一个程序，模拟扔硬币的结果
 */
public class P46_7 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b;
        //扔硬币的次数
        int count = 0;
        //正面的次数
        int front = 0;
        //反面的次数
        int reverse = 0;
        for (int i = 0; i < 10000; i++) {
            count += 1;
            b = random.nextBoolean();
            if (b){
                front += 1;
                System.out.println("第" + count + "次扔硬币，硬币为正面!");
            } else {
                reverse += 1;
                System.out.println("第" + count + "次扔硬币，硬币为反面.");
            }
        }

        System.out.println("正面的次数为: " + front + "次");
        System.out.println("反面的次数为: " + reverse + "次");
    }
}