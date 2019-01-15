package lessons;

import java.util.Scanner;

public class Lesson3a {
    public static void main(String[] args) {
        String a = "qwerty";

        String b = "sdfgdg";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        b = a;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        b = "qwerty";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        b = new String("qwerty");
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
