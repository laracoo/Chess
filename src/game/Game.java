package game;

import game.chessman.*;
import game.field.Cell;
import game.field.Field;
import game.player.Color;
import game.player.Player;
import game.printer.ChessStatePrinter;
import game.printer.ConsoleStatePrinter;
import game.printer.StatePrinter;
import game.state.State;

public class Game {
    private StatePrinter statePrinter = new ConsoleStatePrinter();
    private State state = new State();


    private Field field;
    private Player player1 = new Player(Color.WHITE);
    private Player player2 = new Player(Color.BLACK);


    public void start() {
        createPawns(player2);
        createPawns(player1);

        createElephants(player1);
        createElephants(player2);

        createRoot(player1);
        createRoot(player2);

        createKnight(player2);
        createKnight(player1);

        createQueen(player1);
        createQueen(player2);

        createKing(player2);
        createKing(player1);

        //System.out.println(state);
        statePrinter.printState(state);

        System.out.println("Игра началась");
        //statePrinter.printState(state);

        ChessStatePrinter cap = new ChessStatePrinter();
        cap.printState(state);


    }

    private void createPawns(Player player) {
        Cell.Letter[] values = Cell.Letter.values();
        int numb = 2;
        if (player.getColor() == Color.BLACK)
            numb = 7;
        for (int i = 1; i < 9; i++) {
            String id = "p" + i;
            Pawn pawn = new Pawn(id, player);
            Cell c = new Cell(values[i - 1], numb);
            pawn.setCell(c);
            state.addChessman(pawn);
        }

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    private void createElephants(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Bishop elephant = new Bishop("e1", player);
        Cell d = new Cell(Cell.Letter.C, numb);
        elephant.setCell(d);
        state.addChessman(elephant);

        elephant = new Bishop("e2", player);
        d = new Cell(Cell.Letter.F, numb);
        elephant.setCell(d);
        state.addChessman(elephant);
    }

    private void createRoot(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Rook rook = new Rook("r1", player);
        Cell s = new Cell(Cell.Letter.A, numb);
        rook.setCell(s);
        state.addChessman(rook);

        rook = new Rook("r2", player);
        s = new Cell(Cell.Letter.H, numb);
        rook.setCell(s);
        state.addChessman(rook);

    }

    private void createKnight(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Knight knight = new Knight("k1", player);
        Cell se = new Cell(Cell.Letter.B, numb);
        knight.setCell(se);
        state.addChessman(knight);

        knight = new Knight("k2", player);
        se = new Cell(Cell.Letter.G, numb);
        knight.setCell(se);
        state.addChessman(knight);

    }

    private void createQueen(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Queen queen = new Queen("q1", player);
        Cell se = new Cell(Cell.Letter.D, numb);
        queen.setCell(se);
        state.addChessman(queen);
    }

    private void createKing(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        King king = new King("king1", player);
        Cell se = new Cell(Cell.Letter.E, numb);
        king.setCell(se);
        state.addChessman(king);
    }
}
