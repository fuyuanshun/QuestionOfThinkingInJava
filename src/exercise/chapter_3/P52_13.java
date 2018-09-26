package exercise.chapter_3;

/**
 * 练习13
 *  编写一个方法，它以二进制形式显示char类型的值。使用多个不同的字符来展示它.
 */
public class P52_13 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'd'};
        charToBinary(chars);
    }

    /**
     * 将char类型的字符使用十六进制显示出来
     * @param chars char类型的数组
     */
    private static void charToBinary(char[] chars) {
        for (char c : chars) {
            System.out.println("char: " + c + "的二进制形式为:" +Integer.toBinaryString((int)c));
        }
    }
}/* Output
        char: a的二进制形式为:1100001
        char: b的二进制形式为:1100010
        char: d的二进制形式为:1100100
 */