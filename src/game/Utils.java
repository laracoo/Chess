package game;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Letter;
import game.player.Color;
import game.player.Player;

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

    public static boolean onVerticalLine(Cell c1, Cell c2) {
        return c1.getLet() == c2.getLet();

    }

    public static boolean onHorizontalLine(Cell c1, Cell c2) {
        return c1.getNum() == c2.getNum();

    }

    public static boolean onDiagonalLine(Cell c1, Cell c2) {

        int o1 = c1.getNum();
        int o2 = c2.getNum();
        int j = (o1 > o2) ? o1 - o2 : o2 - o1;
        int k = Utils.betweenLetters(c1.getLet(), c2.getLet());
        return j == k;
    }

    public static boolean aroundChess(Cell c1, Cell c2) {

        int o1 = c1.getNum();
        int o2 = c2.getNum();
        int j = (o1 > o2) ? o1 - o2 : o2 - o1;
        int k = Utils.betweenLetters(c1.getLet(), c2.getLet());
        return j == 1 && k == 1 || j == 0 && k == 1 || j == 1 && k ==0;
    }
    public static boolean pawnGo(Cell c1, Cell c2) {

        int o1 = c1.getNum();
        int o2 = c2.getNum();
        int j = (o1 > o2) ? o1 - o2 : o2 - o1;
        int k = Utils.betweenLetters(c1.getLet(), c2.getLet());
        if (Player.getColor() == Color.WHITE) {
            return (o1 == 2) ? j == 2 && o2 != 1 && k == 0 || j == 1 && k == 0 && o2 != 1 : j == 1 && k == 0 && o2 > o1;
        } else {
            return (o1 == 7) ? j == 2 && o2 < o1 && k == 0 || j == 1 && k == 0 && o2 < o1 : j == 1 && k == 0 && o2 < o1;
        }
    }
        public static boolean eatPawn(Cell c1, Cell c2) {

            int o1 = c1.getNum();
            int o2 = c2.getNum();
            int j = (o1 > o2) ? o1 - o2 : o2 - o1;
            int k = Utils.betweenLetters(c1.getLet(), c2.getLet());
            if (Player.getColor() == Color.WHITE) {
                return j == 1 && k == 1 && o2 > o1;
            } else {
                return j == 1 && k == 1 && o2 < o1;
            }
    }
}