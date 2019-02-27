package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;
public class Bishop extends Chessman {


    public Bishop(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2657' : '\u265D');

    }

    @Override
    public boolean canMove(Cell cell) {
        return false;
    }

    @Override
    public boolean canEat(Cell cell) {
        return false;
    }
}
