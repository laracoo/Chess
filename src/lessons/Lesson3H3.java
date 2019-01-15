package lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3H3 {

    public static void main(String[] args) {


        List<Integer> a = generateList();  // нечет
        List<Integer> b = generateList(); //чет
        System.out.println(a);
        System.out.println(b);

        if (check(0, b)) {
            perenos(0, b, a);
        }

        System.out.println(a);
        System.out.println(b);
    }

    public static List<Integer> generateList() {

        List<Integer> list = new ArrayList<>();
        Random g = new Random();
        for (int i = 0; i < 20; i += 1) {
            int ran = g.nextInt(101);
            list.add(ran);
        }

        return list;
    }

    /**
     * Берет элемент num-й из l1 и переносит в l2
     * Удаляет из списка l1 !!!!!!!
     *
     * @param num
     * @param l1
     * @param l2
     */
    public static void perenos(Integer num, List<Integer> l1, List<Integer> l2) {
        int y = l1.get(num);
        l2.add(y);
    }

    /**
     * Проверяет четность num-ого числа в списке
     *
     * @param uoi
     */
    public static boolean check(Integer uoi, List<Integer> l) {
        int r = l.get(uoi);
        if ((r % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
