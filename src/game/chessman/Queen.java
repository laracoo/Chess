package game.chessman;

import game.Utils;
import game.field.Cell;
import game.field.Letter;
import game.player.Color;
import game.player.Player;

public class Queen extends Chessman {
    public Queen(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2655' : '\u265B');
    }

    @Override
    public boolean canMove(Cell cell) {
        return false;
    }

    @Override
    public boolean canEat(Cell cell) {
        return false;
    }

    private boolean action(Cell c1, Cell c2) {

        if (c1.getNum() == c2.getNum()) {
            return true;
        }

        if (c1.getLet() == c2.getLet()) {
            return true;
        }

        int o1 = c1.getNum();
        int o2 = c2.getNum();
        int j = (o1 > o2) ? o1 - o2 : o2 - o1;
        int k = Utils.betweenLetters(c1.getLet(),c2.getLet());
        //TODO закончить
        //System.out.println(k + " " + j);
        return false;
    }

    public static void main(String[] args) {
        Cell l = new Cell(Letter.D, 4);
        Cell l2 = new Cell(Letter.F, 6);
        Queen p = new Queen("1", new Player(Color.BLACK));
        System.out.println(p.action(l , l2));   //true

        Cell l3 = new Cell(Letter.F, 7);
        System.out.println(p.action(l , l3));   //false

    }


}
