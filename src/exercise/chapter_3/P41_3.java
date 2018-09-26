package exercise.chapter_3;

/**
 * 练习3
 *  创建一个包含一个float域的类，并用这个类来展示方法调用时的别名机制.
 */
public class P41_3 {
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.f = 1;
        System.out.println("f = " + letter.f);
        f(letter);
        System.out.println("f = " + letter.f);
    }

    private static void f(Letter letter) {
        letter.f = 5;
    }
}/* Output:
   f = 1.0
   f = 5.0
*/

class Letter{
    float f;
}
