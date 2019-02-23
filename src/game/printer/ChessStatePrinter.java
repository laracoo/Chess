package game.printer;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.state.State;

import java.util.List;

public class ChessStatePrinter implements StatePrinter {
    Field f2 = new Field();

    @Override
    public void printState(State state) {
        for (int u = 0; u < 8; u++) {
            List<Cell> row3 = f2.getRow(u);
            for (int i = 0; i < 8; i++) {
                Chessman chee = state.getChessman(row3.get(i));
                if (chee == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(chee.getPicture());
                }

            }
            System.out.println();
        }
/*
        System.out.println("=========pawns===========");
        Chessman chee = state.getChessman(new Cell(Cell.Letter.A, 2));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.A, 7));
        System.out.println(chee.getPicture());
        System.out.println("========bishops=======");
        chee = state.getChessman(new Cell(Cell.Letter.C, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.C,8 ));
        System.out.println(chee.getPicture());
        System.out.println("===========kings===========");
        chee = state.getChessman(new Cell(Cell.Letter.E, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.E,8 ));
        System.out.println(chee.getPicture());
        System.out.println("===========queens===========");
        chee = state.getChessman(new Cell(Cell.Letter.D, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.D,8 ));
        System.out.println(chee.getPicture());
        System.out.println("===========rooks===========");
        chee = state.getChessman(new Cell(Cell.Letter.A, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.A,8 ));
        System.out.println(chee.getPicture());
        System.out.println("===========knights===========");
        chee = state.getChessman(new Cell(Cell.Letter.B, 1));
        System.out.println(chee.getPicture());
        chee = state.getChessman(new Cell(Cell.Letter.B,8 ));
        System.out.println(chee.getPicture());
*/


    }
}
