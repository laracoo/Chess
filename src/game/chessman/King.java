package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;

public class King extends Chessman {

    public King(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2654' : '\u265A');
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
