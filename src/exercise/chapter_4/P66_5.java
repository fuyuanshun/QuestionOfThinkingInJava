package exercise.chapter_4;

/**
 *  练习5
 *   重复第三章的练习10， 不要用Integer.toBinaryString()方法，而是使用
 *   三元操作符和按位操作符来显示二进制的1和0
 */
public class P66_5 {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x5555aaaa;

        System.out.println("使用二进制表示 a = " + Integer.toBinaryString(a));
        System.out.println("使用二进制表示 b = " + Integer.toBinaryString(b));
        System.out.println("a & b = " + toBinaryString(a&b));
        System.out.println("a | b = " +  toBinaryString(a|b));
        System.out.println("a ^ b = " +  toBinaryString(a^b));
        System.out.println("~a = " +  toBinaryString(~a));
        System.out.println("~b = " +  toBinaryString(~b));
    }

    private static String toBinaryString(int num) {
        if(num == 0) return "" + 0;
        String result = "";
        //获得左边0的个数， 然后将左边的0全部移出.
        int n = Integer.numberOfLeadingZeros(num);
        num <<= n;
        for (int i = 0; i < 32 - n; i++) {
            //如果左边还有0，则返回0. result += 0 然后执行左移  如果没有0，则返回1. result += 1.然后左移
            int x = (Integer.numberOfLeadingZeros(num) == 0) ? 1 : 0;
            result += x;
            num <<= 1;
        }
        return result;
    }
}/* Output :
        使用二进制表示 a = 10101010101010101010101010101010
        使用二进制表示 b = 1010101010101011010101010101010
        a & b = 1010101010101010
        a | b = 11111111111111111010101010101010
        a ^ b = 11111111111111110000000000000000
        ~a = 1010101010101010101010101010101
        ~b = 10101010101010100101010101010101
*/