package exercise.chapter_2;

/**
 * 练习16
 *  找到第5章中的Overloading.java示例，并为它加入javadoc文档。然后用javadoc提取此注释文档，并产生
 *  一个HTML文件，最后，通过Web浏览器查看结果。
 */
public class P37_16 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Overloaded method");
        }
        //Overloaded constructor:
        new Tree();
    }
}

class Tree{
    /**
     * 树的高度
     */
    int height;

    /**
     * 普通构造方法
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * 可以初始化默认高度的构造方法
     * @param initialHeight 树的默认高度
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + "feet tall");
    }

    /**
     *输出树的信息
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * info()方法的重载方法，多接收一个参数。输出树的信息
     * @param s
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}