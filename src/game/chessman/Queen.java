package game.chessman;

import game.field.Cell;
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
        return false;
    }


}
