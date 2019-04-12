package game.chessman;

import game.Utils;
import game.field.Cell;
import game.player.Color;
import game.player.Player;
public class Bishop extends Chessman {

    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "слон"
     * @param id
     * @param player
     */
    public Bishop(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2657' : '\u265D');

    }

    @Override
    public boolean canMove(Cell cell) {
        boolean d = Utils.onDiagonalLine(this.cell, cell);
        return d;
    }

    @Override
    public boolean canEat(Cell cell) {
        return canMove(cell);
    }
}
