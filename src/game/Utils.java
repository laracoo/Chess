package game;

import game.field.Cell;

import java.util.Arrays;

public class Utils {

    /**
     * Возвращает количесвто букв между l1 и l2
     * @param l1
     * @param l2
     * @return
     */
    public static int betweenLetters(Cell.Letter l1, Cell.Letter l2) {
        Cell.Letter[] values = Cell.Letter.values();
        //System.out.println(Arrays.toString(values));
        // TODO DZ
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(betweenLetters(Cell.Letter.A, Cell.Letter.C));   //2
    }
}
