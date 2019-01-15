package lessons;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson4H {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        // list         u   remove      m
        // 5 6 5 5 7    -5  true        true!!!
        // 6 5 5 7      -5  true        true    list1.add
        // 6 5 7        -5  true        true    list1.add
        // 6 7          -5  false       false    list1.add


        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0)
                break;
            else
                list.add(num);
        }


        for (int i = 0; i < list.size(); i++) {
            Integer u = list.get(i);
            boolean m = list.remove(u);
            i --;

            m = list.remove(u);
            if(!m){
                list1.add(u);

            }



        }
        //

        System.out.println(list);
        System.out.println(list1);
    }

}
