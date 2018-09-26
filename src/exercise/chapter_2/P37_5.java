package exercise.chapter_2;

/**
 * 练习5: 修改练习4，在main方法中赋值并打印
 */
public class P37_5 {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        P37_5 dataOnly = new P37_5();
        dataOnly.i = 1;
        dataOnly.d = 1.1;
        dataOnly.b = true;

        System.out.println("i is " + dataOnly.i);
        System.out.println("d is " + dataOnly.d);
        System.out.println("b is " + dataOnly.b);
    }
}/* Output:
        i is 1
        d is 1.1
        b is true
 */