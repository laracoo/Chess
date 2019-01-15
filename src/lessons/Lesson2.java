package lessons;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibbinachi(num));

    }
    static int fibbinachi(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int y = f1 + f2;
        for (int i = 0; i < num - 3; i++) {
            f2 = f1;
            f1 = y;
            y = f1 + f2;

        }
      return y;

    }

}

