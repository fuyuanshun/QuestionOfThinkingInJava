package exercise.chapter_3;

/**
 * 练习10
 *  编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低有效位为0，另一个
 *  也具有交替的二进制位1和0，但是其最低有效位为1（提示:使用十六进制常量来表示是为简单的方法）。
 *  取这两个值，用位操作符以所有可能的方式结合运算他们，然后用Integer.toBinaryString()显示.
 */
public class P49_10 {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x5555aaaa;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println("a & b = " + Integer.toBinaryString(a&b));
        System.out.println("a | b = " +  Integer.toBinaryString(a|b));
        System.out.println("a ^ b = " +  Integer.toBinaryString(a^b));
        System.out.println("~a = " +  Integer.toBinaryString(~a));
        System.out.println("~b = " +  Integer.toBinaryString(~b));
    }
}/* Output:
        10101010101010101010101010101010
        1010101010101011010101010101010
        a & b = 1010101010101010
        a | b = 11111111111111111010101010101010
        a ^ b = 11111111111111110000000000000000
        ~a = 1010101010101010101010101010101
        ~b = 10101010101010100101010101010101

 */