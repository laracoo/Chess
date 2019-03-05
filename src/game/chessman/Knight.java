package game.chessman;

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
        return false;
    }

    @Override
    public boolean canEat(Cell cell) {
        return false;
    }

    /**
     * передвижение фигур, метод определяет можно ли передвинуть фигуру на ту или инную клетку
     * @param c1
     * @param c2
     * @return
     */
    private boolean action(Cell c1, Cell c2) {
        int x = c1.getNum();
        Letter y = c1.getLet();

        int a = c2.getNum();
        Letter b = c2.getLet();

        if (x - a > 2 || a - x > 2) {
            return false;
        }




        return true;

    }
}
