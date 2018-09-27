package exercise.chapter_2;

/**
 * 练习11
 *  将AllTheColorsOfTheRainbow这个示例改写成一个程序，然后编译、运行。
 */
public class P37_11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow act = new AllTheColorsOfTheRainbow();
        System.out.println("before changeColor, atc.anIntegerRepresentingColors is " + act.anIntegerRepresentingColors);
        System.out.println("before changeTheHueOfTheColor, atc.hue is " + act.hue);

        act.changeColor(5);
        act.changeTheHueOfTheColor(50);
        System.out.println("after changeColor, atc.anIntegerRepresentingColors is " + act.anIntegerRepresentingColors);
        System.out.println("after changeTheHueOfTheColor, atc.hue is " + act.hue);
    }
}

class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors = 0;
    int hue = 0;

    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }

    void changeColor(int newColor) {
        anIntegerRepresentingColors = newColor;
    }
}/* Output:
        before changeColor, atc.anIntegerRepresentingColors is 0
        before changeTheHueOfTheColor, atc.hue is 0
        after changeColor, atc.anIntegerRepresentingColors is 5
        after changeTheHueOfTheColor, atc.hue is 50
*/