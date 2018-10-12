package exercise.test;

import java.util.Scanner;
/**
 * 使用正则表达式，使用户只能输入一个或多个数字
 */
public class InputNumber {
    public static void main(String[] args) {
        System.out.println("Please input a number:");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        while (!s.matches("^\\d+$")) {
            System.out.println("You can only enter number!");
            s = scanner.nextLine();
        }
        switch (Integer.parseInt(s)) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
                default:
                    System.out.println("You input is " + s);
        }
    }
}