package exercise.chapter_3;

/**
 * 练习5
 * 创建一个名为Dog的类，它包含两个String域: name和says。 在main()方法中，创建
 * 两个Dog对象，一个名为spot（它的叫声为“Ruff!"）, 另一个名为scruffy(他的叫声为”Wurf!").
 * 然后显示它们的名字和叫声.
 */
public class P45_5 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy!";
        scruffy.says = "Wurf!";

        System.out.println("Dog1\n name: " + spot.name + "\n says : " + spot.says);
        System.out.println("Dog2\n name: " + scruffy.name + "\n says : " + scruffy.says);

    }
}/* Output:
     Dog1
      name: spot
      says : Ruff!
     Dog2
      name: scruffy!
      says : Wurf!
*/
