package exercise.chapter_4;

/**
 * 练习6
 * 修改前两个程序中的两个test()方法，让它们接受两个额外的参数begin和end，这样在测试testval时
 * 将判断它是否在begin和end之间(包括begin和end)的范围内。
 */
public class P69_6 {
    public static void main(String[] args) {
        System.out.println(test(5, 3, 8));
        System.out.println(test(5, 3, 4));
        System.out.println(test(10, 8, 3));
        System.out.println(test(5, 5, 5));
    }

    static int test(int testval, int begin, int end) {
        if(end < begin) {
            System.out.println("end can't < begin");
            return 0;
        }
        if (testval >= begin && testval <= end) {
            return 1;
        }
        if (testval < begin || testval > end) {
            return -1;
        }
        System.out.println("exceptional case");
        return 0;
    }
}