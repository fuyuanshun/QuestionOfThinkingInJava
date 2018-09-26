package exercise.chapter_3;

/**
 * 练习10
 *  编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低有效位为0，另一个
 *  也具有交替的二进制位1和0，但是其最低有效位为1（提示:使用十六进制常量来表示是为简单的方法）。
 *  取这两个值，用位操作符以所有可能的方式结合运算他们，然后用Integer.toBinaryString()显示.
 */
public class P49_10 {
    public static void main(String[] args) {
        int a = 0xaaaa;
        int b = 0x5555;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println("a & b = " + Integer.toBinaryString(a&b));
        System.out.println("a | b = " +  Integer.toBinaryString(a|b));
        System.out.println("a ^ b = " +  Integer.toBinaryString(a^b));
        System.out.println("~a = " +  Integer.toBinaryString(~a));
        System.out.println("~b = " +  Integer.toBinaryString(~b));
    }
}/* Output:
        1010101010101010
        101010101010101
        a & b = 0
        a | b = 1111111111111111
        a ^ b = 1111111111111111
        ~a = 11111111111111110101010101010101
        ~b = 11111111111111111010101010101010
 */