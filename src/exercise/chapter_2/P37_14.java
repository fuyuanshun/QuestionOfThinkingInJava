package exercise.chapter_2;

/*
 * 练习 14
 *  在前一个练习的文档中加入各项的HTML列表
 */

import java.util.Date;

/**
 * You can <em>even</em> insert a list:
 * <ol>
 *     <li>Item one</li>
 *     <li>Item two</li>
 *     <li>Item three</li>
 * </ol>
 */
public class P37_14 {
    /**
     * 给public域添加列表
     * <ol>
     *     <li>One</li>
     *     <li>two</li>
     *     <li>three</li>
     * </ol>
     */
    public int i = 10;

    /**
     * 给private域添加列表
     * <ol>
     *     <li>One</li>
     *     <li>two</li>
     *     <li>three</li>
     * </ol>
     */
    private int j = 10;

    /**
     * main方法添加列表
     * <ol>
     *     <li>One</li>
     *     <li>two</li>
     *     <li>three</li>
     * </ol>
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("new Date() = " + new Date());
    }
}