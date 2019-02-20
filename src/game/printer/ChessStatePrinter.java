package game.printer;

import game.field.Cell;
import game.field.Field;
import game.state.State;

import java.util.List;

public class ChessStatePrinter implements StatePrinter {
    @Override
    public void printState(State state) {
        System.out.println("=============================");
        /*

        Chessman chee = state.getChessman(new Cell(Cell.Letter.A, 7));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.A, 2));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.C, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.C,8 ));
        System.out.println(chee.getPicture());
        */

        Field field = new Field();
        List<Cell> row = field.getRow(0);
        System.out.println(row);

    }
}
