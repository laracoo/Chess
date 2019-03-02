package game;

import game.field.Letter;

public class Utils {

    /**
     * Возвращает количесвто букв между l1 и l2
     *
     * @param l1
     * @param l2
     * @return
     */
    public static int betweenLetters(Letter l1, Letter l2) {
        int n1 = l1.getNumber();
        int n2 = l2.getNumber();
        return (n1 > n2) ? n1 - n2 : n2 - n1;
    }

}
