package exercise.chapter_4;

/**
 *  写一个switch开关语句，为每个case打印一个信息。然后把这个switch放进for循环来测试
 *  每个case
 */
public class P75_8 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            switch (i) {
                case 1:
                    System.out.println("The value is 1");
                case 2:
                    System.out.println("The value is 2");
                case 3:
                    System.out.println("The value is 3");
                    default:
                        System.out.println("The value is "+ i +". bigger than 3");
            }
        }
    }
}/* Output:
        The value is 1
        The value is 2
        The value is 3
        The value is 4. bigger than 3
        The value is 5. bigger than 3

    去掉break后：
        The value is 1
        The value is 2
        The value is 3
        The value is 1. bigger than 3
        The value is 2
        The value is 3
        The value is 2. bigger than 3
        The value is 3
        The value is 3. bigger than 3
*/