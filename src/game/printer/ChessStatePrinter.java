package game.printer;

import game.chessman.Chessman;
import game.field.Cell;
import game.state.State;

public class ChessStatePrinter implements StatePrinter {
    @Override
    public void printState(State state) {
        Chessman chee = state.getChessman(new Cell(Cell.Letter.A, 7));
        System.out.println(chee);
        chee = state.getChessman(new Cell(Cell.Letter.B, 2));
        System.out.println(chee);
    }
}
