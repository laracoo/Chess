package game.chessman;

import game.Utils;
import game.field.Cell;
import game.field.Letter;
import game.player.Color;
import game.player.Player;

public class Knight extends Chessman {
    /**
     * По цвету игрока присаевает ему соответственного цвета фигуру "конь"
     * @param id
     * @param player
     */
    public Knight(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2658' : '\u265E');
    }

    @Override
    public boolean canMove(Cell cell) {
        int x = this.cell.getNum();
        Letter y = this.cell.getLet();

        int a = cell.getNum();
        Letter b = cell.getLet();

        int s = a > x ? a - x : x - a;
        int l = Utils.betweenLetters(y , b);
        return  (s == 2 && l == 1 || s == 1 && l == 2);
    }

    @Override
    public boolean canEat(Cell cell) {
        return canMove(cell);
    }

}
