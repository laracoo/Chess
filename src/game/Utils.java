package game;

import game.field.Cell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    /**
     * Возвращает количесвто букв между l1 и l2
     * @param l1
     * @param l2
     * @return
     */
    public static int betweenLetters(Cell.Letter l1, Cell.Letter l2) {
        int n = 0;
        int y = 0;
        Cell.Letter[] values = Cell.Letter.values();
        List t = Arrays.asList(values);

        for(int i = 0; i < t.size(); i++) {

            if(l1 == t.get(i)){
                n = i;

            }
            if (l2 == t.get(i)){
                y = i;
                System.out.println(i);
            }

        }
        int g = y - n;

return g;

    }

    public static void main(String[] args) {
        System.out.println("Result:"+betweenLetters(Cell.Letter.A, Cell.Letter.D));   //3
    }
}
