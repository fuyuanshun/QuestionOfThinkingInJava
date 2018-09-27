package exercise.chapter_2;

/**
 * 练习10
 *  编写一个程序，打印出从命令行获得的三个参数。为此，需要确定命令行数组中String的下标。
 *  (在本习题中，我使用IDEA编写程序，在命令行参数中输入了: fys fys2 fys3)
 */
public class P37_10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("没有接收到命令行参数.");
            return;
        }
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("args[2] = " + args[2]);
    }
}/* Output:
        args[0] = fys
        args[1] = fys2
        args[2] = fys3
*/