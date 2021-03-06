package exercise.chapter_3;

/**
 * 练习12
 *  以一个所有位都为1的二进制数字开始，先左移它，然后用无符号右移操作符对其进行右移，
 *  直至所有的二进制位都被移出为止，每移一位都要使用Integer.toBinaryString()显示结果.
 */
public class P52_12 {
    public static void main(String[] args) {
        int a = -1;
        System.out.println("使用二进制表示该数字为: " + Integer.toBinaryString(a));
        a <<= 1;
        System.out.println("左移一位之后的值为: " + Integer.toBinaryString(a));
        //右移32位，将所有的二进制位全部移出.
        for (int i = 0; i < 32; i++) {
            a >>>= 1;
            System.out.println("右移一位后的值为: " + Integer.toBinaryString(a));
        }
    }
}/* Output:
        使用二进制表示该数字为: 11111111111111111111111111111111
        左移一位之后的值为: 11111111111111111111111111111110
        右移一位后的值为: 1111111111111111111111111111111
        右移一位后的值为: 111111111111111111111111111111
        右移一位后的值为: 11111111111111111111111111111
        右移一位后的值为: 1111111111111111111111111111
        右移一位后的值为: 111111111111111111111111111
        右移一位后的值为: 11111111111111111111111111
        右移一位后的值为: 1111111111111111111111111
        右移一位后的值为: 111111111111111111111111
        右移一位后的值为: 11111111111111111111111
        右移一位后的值为: 1111111111111111111111
        右移一位后的值为: 111111111111111111111
        右移一位后的值为: 11111111111111111111
        右移一位后的值为: 1111111111111111111
        右移一位后的值为: 111111111111111111
        右移一位后的值为: 11111111111111111
        右移一位后的值为: 1111111111111111
        右移一位后的值为: 111111111111111
        右移一位后的值为: 11111111111111
        右移一位后的值为: 1111111111111
        右移一位后的值为: 111111111111
        右移一位后的值为: 11111111111
        右移一位后的值为: 1111111111
        右移一位后的值为: 111111111
        右移一位后的值为: 11111111
        右移一位后的值为: 1111111
        右移一位后的值为: 111111
        右移一位后的值为: 11111
        右移一位后的值为: 1111
        右移一位后的值为: 111
        右移一位后的值为: 11
        右移一位后的值为: 1
        右移一位后的值为: 0
*/