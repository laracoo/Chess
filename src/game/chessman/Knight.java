package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;

public class Knight extends Chessman {
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

    private boolean action(Cell c1, Cell c2) {
        int x = c1.getNum();
        Cell.Letter y = c1.getLet();

        int a = c2.getNum();
        Cell.Letter b = c2.getLet();
        if (x - a > 2 || a - x > 2) {
            return false;
        }

        Cell.Letter[] values = Cell.Letter.values();


        return true;

    }
}
