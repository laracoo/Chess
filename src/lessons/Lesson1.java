package lessons;

import java.util.*;

public class Lesson1 {

    /**
     * yuituiygjkhg
     *
     * @param args
     */
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int mr = sc.nextInt();
            num[i] = mr;
        }

        sort(num);
        System.out.println(Arrays.toString(num));


        ArrayList<Integer> kucha1 = new ArrayList<>();
        ArrayList<Integer> kucha2 = new ArrayList<>();


        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < num.length; i++) {
            int kamen = num[9-i];
            if (sum1 > sum2) {
                sum2 += kamen;
                kucha2.add(kamen);
            } else {
                sum1 += kamen;
                kucha1.add(kamen);
            }

        }

        System.out.println(sum1 + " " + sum2);
        System.out.println(kucha1);
        System.out.println(kucha2);


    }

    static void sort(int[] mas) {
        System.out.println("Начинается сортировка");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int u = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = u;

                }


            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Заканчивается сортировка");
    }
}
