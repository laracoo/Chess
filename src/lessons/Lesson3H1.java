package lessons;

import java.util.Scanner;

public class Lesson3H1 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int num = c.nextInt();
        System.out.println(factarial(num));
    }
    public static int factarial(int n ){
        if (n == 0) return  1;
        return n * factarial(n - 1);
    }
}
