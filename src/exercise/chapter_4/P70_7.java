package exercise.chapter_4;

/**
 * 练习7
 * 修改本章练习1， 通过使用break关键词，使得程序在打印到99时退出。然后尝试使用return来达到相同的目的。
 */
public class P70_7 {
    public static void main(String[] args) {
        //使用break使程序打印到99退出
        System.out.println();
        for (int i = 1; i < 101; i ++) {
            if(i == 99)
                break;
            System.out.println(i);
        }

        //使用return
        System.out.println("Using return");
        for (int i = 0; i < 101; i++) {
            if(i == 99)
                return;
            System.out.println(i);
        }
    }
}