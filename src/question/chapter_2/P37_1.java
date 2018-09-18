package question.chapter_2;

/**
 *  第二章  一切皆是对象
 *   P.37 练习1
 *   创建一个类，包含一个int域和一个char域，他们都没有被初始化，将他们的值打印出来，以验证Java执行了默认的初始化
 */
public class P37_1 {
    int i;
    char c;

    P37_1() {
        System.out.println("i is : " +i);
        System.out.println("c is : " + c);
    }

    public static void main(String[] args) {
        new P37_1();
    }
}
 /* Output :
        0
 */