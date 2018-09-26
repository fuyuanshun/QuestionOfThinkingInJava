package exercise.chapter_3;

/**
 * 练习9
 *  分别显示用float和double指数计数法所能表示的最大和最小的数字。
 */
public class P49_9 {
    public static void main(String[] args) {
        float fMax = Float.MAX_VALUE;
        float fMin = Float.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        double dMin = Double.MIN_VALUE;

        System.out.println("float表示最小的数字为: " + fMin);
        System.out.println("float表示最大的数字为: " + fMax);

        System.out.println("double表示最小的数字为: " + dMin);
        System.out.println("double表示最大的数字为: " + dMax);
    }
}/* Output:
    float表示最小的数字为: 1.4E-45
    float表示最大的数字为: 3.4028235E38
    double表示最小的数字为: 4.9E-324
    double表示最大的数字为: 1.7976931348623157E308
*/