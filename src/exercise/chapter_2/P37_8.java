package exercise.chapter_2;

/**
 * 练习8
 *  编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的static域只有一个实例.
 */
public class P37_8 {

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println("直接打印Test.i 以及新建的两个对象的i值:");
        System.out.println("InputNumber.i is " + Test.i);
        System.out.println("test1.i is " + test1.i);
        System.out.println("test2.i is " + test2.i);

        increment();
        System.out.println("调用increment()方法后的i值:");
        System.out.println("InputNumber.i is " + Test.i);
        System.out.println("test1.i is " + test1.i);
        System.out.println("test2.i is " + test2.i);

        Test.i -= 10;
        System.out.println("InputNumber.i - 10 之后的值: ");
        System.out.println("InputNumber.i is " + Test.i);
        System.out.println("test1.i is " + test1.i);
        System.out.println("test2.i is " + test2.i);
        System.out.println("InputNumber.i == test1.i is " + (Test.i == test1.i));
        System.out.println("InputNumber.i == test2.i is " + (Test.i == test2.i));
    }

    private static void increment() {
        Test.i += 1;
    }
}/* Output:
        直接打印Test.i 以及新建的两个对象的i值:
        InputNumber.i is 50
        test1.i is 50
        test2.i is 50
        调用increment()方法后的i值:
        InputNumber.i is 51
        test1.i is 51
        test2.i is 51
        InputNumber.i - 10 之后的值:
        InputNumber.i is 41
        test1.i is 41
        test2.i is 41
        InputNumber.i == test1.i is true
        InputNumber.i == test2.i is true
*/

class Test{
    static int i = 50;
}