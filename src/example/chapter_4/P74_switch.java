package example.chapter_4;

import java.util.Random;

public class P74_switch {
    public static void main(String[] args) {
        Random random = new Random();
        int c;
        for (int i = 0; i < 100; i++) {
            c = random.nextInt(26) + 'a';
            System.out.print((char)c + ", Ascii code is " + c + ". ");

            switch ((char)c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes vowel");
                    break;
                    default:
                        System.out.println("consonant");
            }
        }
    }
}