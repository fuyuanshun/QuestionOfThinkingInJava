package exercise.chapter_3;

/**
 * 练习2
 *  创建一个包含一个float域的类， 并用这个类来展示别名机制。
 */
public class P40_2 {
    float f;
    public static void main(String[] args) {
        P40_2 alias1 = new P40_2();
        P40_2 alias2 = new P40_2();
        alias1.f = 1.5f;
        alias2.f = 2.5f;

        alias2 = alias1;
        alias2.f = 3.4f;

        System.out.println(alias1.f);
        System.out.println(alias2.f);
    }
}/* Output:
        3.4
        3.4
 */