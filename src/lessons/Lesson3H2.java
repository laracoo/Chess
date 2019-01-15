package lessons;

import java.util.Scanner;

public class Lesson3H2 {
    public static void main(String[] args) {
        System.out.println(fact(new Scanner(System.in).nextInt()));

    }

    public static int fact(int n) {
        return (n == 0 ? 1 : n * fact(n-1));
    }
}
