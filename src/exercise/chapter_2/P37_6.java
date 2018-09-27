package exercise.chapter_2;

/**
 * 练习6: 编写一个程序，让它含有本章所定义的storage()方法的代码段，并调用之.
 */
public class P37_6 {

    public static void main(String[] args) {
        String str ="Hello World!";
        int len = new P37_6().storage(str);
        System.out.println(str + " 的2倍长度为: " + len);
    }

    int storage(String s) {
        return s.length() * 2;
    }
}/* Output:
        Hello World!的2倍长度为: 24
*/