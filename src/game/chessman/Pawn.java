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
        int k = Utils.betweenLetters(this.cell.getLet(), cell.getLet());
        if (k != 0)
            return false;
        int o1 = this.cell.getNum();
        int o2 = cell.getNum();

        // o1 == 2 white            o2 == 3 || o2 == 4
        // o1 == 7 black

        int j = (o1 > o2) ? o1 - o2 : o2 - o1;
        if (this.getColor() == Color.WHITE) {
            return (o1 == 2) ? o2 == 3 || o2 == 4 : o2 - o1 == 1;
        } else {
            return (o1 == 7) ? o2 == 5 || o2 == 6 : o1 - o2 == 1;
        }
    }

    @Override
    public boolean canEat(Cell cell) {
        int k = Utils.betweenLetters( this.cell.getLet(), cell.getLet());
        if (k != 1) {
            return false;
        }
        int o1 = this.cell.getNum();
        int o2 = cell.getNum();
        
        return (this.getColor() == Color.WHITE) ?  o2 - o1 == 1 : o1 - o2 == 1;
    }
}
