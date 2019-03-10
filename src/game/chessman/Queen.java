package game.chessman;

import game.Utils;
import game.field.Cell;
import game.field.Letter;
import game.player.Color;
import game.player.Player;

public class Queen extends Chessman {
    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "королева"
     *
     * @param id
     * @param player
     */
    public Queen(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2655' : '\u265B');
    }


    @Override
    public boolean canMove(Cell cell) {
        boolean d = Utils.onDiagonalLine(this.cell, cell);
        boolean v = Utils.onVerticalLine(this.cell, cell);
        boolean h = Utils.onHorizontalLine(this.cell, cell);
        return d || v || h ;
    }

    @Override
    public boolean canEat(Cell cell) {
        return canMove(cell);
    }


}
