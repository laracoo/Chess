package lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        List<Integer> a = generateList();  // нечет
        List<Integer> b = generateList(); //чет
        System.out.println(a);
        System.out.println(b);
        int i = 0;
        int j = 0;

        while (i < a.size()) {
            int u = a.get(i);
            if ((u % 2) == 0) {
                b.add(u);
                a.remove(i);
                i--;
            }
            i++;
        }
        while (j < b.size()) {
            int w = b.get(j);
            if ((w % 2) == 1) {
                a.add(w);
                b.remove(j);
                j--;
            }
            j++;

        }

        System.out.println("list1" + a);
        System.out.println("list2" + b);
    }

    public static List<Integer> generateList() {

        List<Integer> list = new ArrayList<>();
        Random g = new Random();
        for (int y = 0; y < 20; y += 1) {
            int ran = g.nextInt(101);
            list.add(ran);
        }
        return list;
    }
}
