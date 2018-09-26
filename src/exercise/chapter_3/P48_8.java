package exercise.chapter_3;

/**
 * 练习8
 *  展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString()来显示结果。
 */
public class P48_8 {
    public static void main(String[] args) {
        long l = 1000;
        System.out.println("十进制 " + l + " 使用十六进制表示为: " + Long.toHexString(l));
        System.out.println("十进制 " + l + " 使用八进制表示为: " + Long.toOctalString(l));
    }
}/*
    十进制 1000 使用十六进制表示为: 3e8
    十进制 1000 使用八进制表示为: 1750
 */