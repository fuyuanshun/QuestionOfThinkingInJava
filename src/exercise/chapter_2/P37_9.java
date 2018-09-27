package exercise.chapter_2;

/**
 * 练习9
 *  编写一个程序，展示自动包装功能对所有的基本类型和包装器类型都起作用.
 */
public class P37_9 {
    public static void main(String[] args) {
        boolean bool = false;
        byte b = 10;
        char c = 'a';
        int i = 10;
        long l = 10;
        float f = 10f;
        double d = 10d;


        System.out.println("bool = " + bool);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        Boolean bool2 = bool;
        System.out.println("Boolean bool2 = " + bool2);
        Byte b2 = b;
        System.out.println("Byte b2 = " + b2);
        Character c2 = c;
        System.out.println("Character c2 = " + c2);
        Integer i2 = i;
        System.out.println("Integer i2 = " + i2);
        Long l2 = l;
        System.out.println("Long l2 = " + l2);
        Float f2 = f;
        System.out.println("Float f2 = " + f2);
        Double d2 = d;
        System.out.println("Double d2 = " + d2);
    }
}/* Output:
        bool = false
        b = 10
        c = a
        i = 10
        l = 10
        f = 10.0
        d = 10.0
        Boolean bool2 = false
        Byte b2 = 10
        Character c2 = a
        Integer i2 = 10
        Long l2 = 10
        Float f2 = 10.0
        Double d2 = 10.0
*/