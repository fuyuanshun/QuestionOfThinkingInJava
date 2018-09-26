package exercise.chapter_3;

/**
 * 练习4
 * 编写一个计算速度的程序，它所使用的距离和时间都是常量.
 */
public class P43_4 {
    public static void main(String[] args) {
        double time = 10;
        double distance = 1000;
        System.out.println("time is " + time);
        System.out.println("distance is " + distance);
        System.out.println("velocity is " + P43_4.velocityCalculator(distance, time));
    }

    /**
     * 计算速度
     * @param d 距离
     * @param t 时间
     * @return 速度
     */
    private static double velocityCalculator(double d, double t) {
        if (t == 0)
            return 0;
        else
            return d / t;
    }
}/* Output:
    time is 10.0
    distance is 1000.0
    velocity is 100.0
*/