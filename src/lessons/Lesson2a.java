package lessons;

import java.util.Scanner;

public class Lesson2a {
    int name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int r  = Integer.getInteger(num );

        System.out.println(f(r));

        System.out.println(" y" +  fail);


    }
    static int fail = 0;

    static int f(Integer num) {
        fail += 1;
        if (num == 1 || num == 2) {
            return 1;
        }

        return f(num - 1 ) + f(num - 2 );

    }

}

