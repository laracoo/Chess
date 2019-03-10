package game.chessman;

import game.Utils;
import game.field.Cell;
import game.player.Color;
import game.player.Player;

public class Pawn extends Chessman {

    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "пешка"
     * @param id
     * @param player
     */
    public Pawn(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2659' : '\u265F');
    }

    @Override
    public boolean canMove(Cell cell) {
        boolean p = Utils.pawnGo(this.cell, cell);
        return p;
    }

    @Override
    public boolean canEat(Cell cell) {
        boolean e = Utils.eatPawn(this.cell, cell);
        return e;
    }
}
