package exercise.chapter_3;

/**
 * 练习6
 * 在练习5的基础上，创建一个新的Dog索引，并对其赋值为spot对象，测试用==和equals()方法
 * 来比较所有的引用的结果
 */
public class P45_6 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy!";
        scruffy.says = "Wurf!";

        Dog dog;
        dog = spot;
        System.out.println("dog == spot is " + (dog == spot));
        System.out.println("dog == scruffy is " + (dog == scruffy));
        System.out.println(("dog.equals(spot) is " + dog.equals(spot)));
        System.out.println(("dog.equals(scruffy) is " + dog.equals(scruffy)));
    }
}/* Output:
     dog == spot is true
     dog == scruffy is false
     dog.equals(spot) is true
     dog.equals(scruffy) is false
*/

/**
 * Dog类
 */
class Dog{
    String name;
    String says;
}












