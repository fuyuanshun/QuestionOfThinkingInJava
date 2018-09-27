package exercise.chapter_3;

/**
 * 练习14
 *  编写一个接收两个字符串参数的方法，用各种布尔值的比较关系来比较这两个字符串，然后
 *  把结果打印出来。做==和!=比较的同时，用equals()做测试。在main()里面用几个不同的字符串对象调用这个方法
 */
public class P63_14 {
    public static void main(String[] args) {
        String str1 = "hello1", str2 = "hello2", str3 = "hello3", str4 = "hello4";
        compareStr(str1, str2);
        compareStr(str3, str4);
    }

    private static void compareStr(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + " is " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + " is " + (str1 != str2));
        System.out.println(str1 + ".equals(" + str2 + ") is " + (str1.equals(str2)));
        System.out.println(str2 + ".equals(" + str1 + ") is " + (str2.equals(str1)));
        System.out.println();
    }

    private static void f(boolean b) {
        if(b)
            System.out.println("true");
        else
            System.out.println("false");
    }
}/* Output:
        hello1 == hello2 is false
        hello1 != hello2 is true
        hello1.equals(hello2) is false
        hello2.equals(hello1) is false

        hello3 == hello4 is false
        hello3 != hello4 is true
        hello3.equals(hello4) is false
        hello4.equals(hello3) is false
*/