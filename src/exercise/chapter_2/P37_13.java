package exercise.chapter_2;

import java.util.Date;

/**
 *  练习 13
 *  通过Javadoc运行Documentation1.java,Documentation2.java和Documentation3.java,
 *  然后通过Web浏览器验证所产生的文档。
 */
public class P37_13 {
    public static void main(String[] args) {
    }

    /** A class comment */
    class Documention1{
        /** A field comment */
        public int i;
        /** A method comment */
        public void f(){}
    }

    /**
     * <pre>
     *     System.out.println(new  Date());
     * </pre>
     */
    class Documention2{
        Date date = new Date();

        void showDate() {
            System.out.println("Date = " + date);
        }
    }

    /**
     * You can <em>even</em> insert a list:
     * <ol>
     *     <li>Item one</li>
     *     <li>Item two</li>
     *     <li>Item three</li>
     * </ol>
     */
    class Documention3{
        Date date = new Date();

        void showDate() {
            System.out.println("Date = " + date);
        }
    }
}
