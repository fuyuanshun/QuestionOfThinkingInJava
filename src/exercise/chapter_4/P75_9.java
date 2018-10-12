package exercise.chapter_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字
 * （从第三个数字起）都是前面两个数字的和。创建一个方法，接受一个整数参数，并显示从
 * 第一个元素开始总共由该参数制定的个数所构成的所有斐波那契数字。
 */
public class P75_9 {
    public static void main(String[] args) {
       List list = fibonacci(10);
        System.out.println("The list is has " + list.size() + " elements:");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer i = (Integer) iterator.next();
//            System.out.print(i + " ");
//        }
        for (Object i : list) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> fibonacci(Integer i) {
        List<Integer> list = null;
        //如果参数为0 返回null.
        if (i <= 0) {
            return list;
        }
        //否则初始化List
        list = new ArrayList<>();
        list.add(1);
        if (i == 1) {
            return list;
        }
        list.add(1);
        if (i == 2) {
            return list;
        } else {
            int f1 = 1, f2 = 1, f3 = 0;
            for (int j = 3; j <= i; j++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                list.add(f3);
            }
            return list;
        }
    }
}