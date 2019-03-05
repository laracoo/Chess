package game;

import game.chessman.*;
import game.field.Cell;
import game.field.Field;
import game.field.Letter;
import game.player.Color;
import game.player.Player;
import game.printer.ChessStatePrinter;
import game.printer.ConsoleStatePrinter;
import game.printer.StatePrinter;
import game.state.State;

/**
 * Основной клас игры
 */
public class Game {
    private StatePrinter statePrinter = new ConsoleStatePrinter();
    private State state = new State();


    private Field field;
    private Player player1 = new Player(Color.WHITE);
    private Player player2 = new Player(Color.BLACK);

    /**
     * Создает фигуры каждому игроку по цветам
     */
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

        System.out.println(state);
        statePrinter.printState(state);

        System.out.println("Игра началась");
        //statePrinter.printState(state);

        ChessStatePrinter cap = new ChessStatePrinter();
        cap.printState(state);


        // временное измнение

        Cell from = new Cell(Letter.A, 2);
        Cell to = new Cell(Letter.A, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.B, 2);
        to = new Cell(Letter.B, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.C, 2);
        to = new Cell(Letter.C, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.D, 2);
        to = new Cell(Letter.D, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.E, 2);
        to = new Cell(Letter.E, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.F, 2);
        to = new Cell(Letter.F, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.G, 2);
        to = new Cell(Letter.G, 4);
        state.changePosition(from, to);

        from = new Cell(Letter.H, 2);
        to = new Cell(Letter.H, 4);
        state.changePosition(from, to);


        System.out.println("============================");
        cap.printState(state);

    }

    /**
     * Создаю пешки двух цветов
     * @param player
     */
    private void createPawns(Player player) {
        Letter[] values = Letter.values();
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

    /**
     * Возращаем Field
     * @return
     */
    public Field getField() {
        return field;
    }

    /**
     * Примвоеваем этому файлу значения
     * @param field
     */
    public void setField(Field field) {
        this.field = field;
    }

    /**
     * Создаю слонов двух цветов
     * @param player
     */
    private void createElephants(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Bishop elephant = new Bishop("e1", player);
        Cell d = new Cell(Letter.C, numb);
        elephant.setCell(d);
        state.addChessman(elephant);

        elephant = new Bishop("e2", player);
        d = new Cell(Letter.F, numb);
        elephant.setCell(d);
        state.addChessman(elephant);
    }
    /**
     * Создаю ладьи двух цветов
     * @param player
     */
    private void createRoot(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Rook rook = new Rook("r1", player);
        Cell s = new Cell(Letter.A, numb);
        rook.setCell(s);
        state.addChessman(rook);

        rook = new Rook("r2", player);
        s = new Cell(Letter.H, numb);
        rook.setCell(s);
        state.addChessman(rook);

    }
    /**
     * Создаю коня двух цветов
     * @param player
     */
    private void createKnight(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Knight knight = new Knight("k1", player);
        Cell se = new Cell(Letter.B, numb);
        knight.setCell(se);
        state.addChessman(knight);

        knight = new Knight("k2", player);
        se = new Cell(Letter.G, numb);
        knight.setCell(se);
        state.addChessman(knight);

    }
    /**
     * Создаю королев двух цветов
     * @param player
     */
    private void createQueen(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        Queen queen = new Queen("q1", player);
        Cell se = new Cell(Letter.D, numb);
        queen.setCell(se);
        state.addChessman(queen);
    }
    /**
     * Создаю королей двух цветов
     * @param player
     */
    private void createKing(Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        King king = new King("king1", player);
        Cell se = new Cell(Letter.E, numb);
        king.setCell(se);
        state.addChessman(king);
    }
}
