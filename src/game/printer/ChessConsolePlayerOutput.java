package game.printer;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.state.State;

import java.util.List;

public class ChessConsolePlayerOutput implements PlayerOutput {
    Field f2 = new Field();

    /**
     * Расставляем фигуры по клеткам
     * @param state
     */
    @Override
    public void send(State state) {
        for (int u = 0; u < 8; u++) {
            List<Cell> row3 = f2.getRow(u);
            for (int i = 0; i < 8; i++) {
                Chessman chee = state.getChessman(row3.get(i));
                if (chee == null) {
                    System.out.printf("%1c", ' ');
                } else {
                    System.out.printf("%1c", chee.getPicture());
                }
            }
            System.out.println();
        }

    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }

}
