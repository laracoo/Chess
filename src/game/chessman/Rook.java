package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;

public class Rook extends Chessman {
    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "ладья"
     * @param id
     * @param player
     */
    public Rook(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2656' : '\u265C');
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
