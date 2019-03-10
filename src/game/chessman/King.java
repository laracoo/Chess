package game.chessman;

import game.Utils;
import game.field.Cell;
import game.player.Color;
import game.player.Player;

public class King extends Chessman {
    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "король"
     * @param id
     * @param player
     */
    public King(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2654' : '\u265A');
    }

    @Override
    public boolean canMove(Cell cell) {
        boolean a = Utils.aroundChess(this.cell, cell);
        return a;
    }

    @Override
    public boolean canEat(Cell cell) {
        return canMove(cell);
    }
}
