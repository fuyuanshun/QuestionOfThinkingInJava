package exercise.chapter_2;

/**
 * 练习7
 *  将Incrementable的代码段改写成一个完整的可运行程序。
 */
public class P37_7 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i is " + StaticTest.i);
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        System.out.println("staticTest1.i is " + staticTest1.i);
        System.out.println("staticTest2.i is " + staticTest2.i);

        increment();
        System.out.println("调用increment之后:");
        System.out.println("StaticTest.i is " + StaticTest.i);
        System.out.println("staticTest1.i is " + staticTest1.i);
        System.out.println("staticTest2.i is " + staticTest2.i);
    }

    static void increment(){
        StaticTest.i++;
    }
}/* Output:
        StaticTest.i is 47
        staticTest1.i is 47
        staticTest2.i is 47
        调用increment之后:
        StaticTest.i is 48
        staticTest1.i is 48
        staticTest2.i is 48
*/

class StaticTest{
    static int i = 47;
}