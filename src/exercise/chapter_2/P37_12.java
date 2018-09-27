package exercise.chapter_2;

import java.util.Date;
/*
    练习12
 *  找出HelloDate.java的第二个版本，也就是那个简单注释文档的示例。
 *  对该文件执行javadoc，然后通过web浏览器观看运行效果
 */
/**
 * The First Thinking in Java example example program.
 * Displays a string and today's date.
 * @author Yuanshun Fu
 * @author https://github.com/fuyuanshun
 * @version 8.8
 *
 */
public class P37_12 {
    /** Entry point to class & application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}