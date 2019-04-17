package game.generators;

import game.chessman.*;
import game.field.Cell;
import game.field.Letter;
import game.player.Color;
import game.player.Player;
import game.state.State;

import java.util.Arrays;

public class ChessmanGenerator {

    public static void generateAllChessman(State state, Player player1, Player player2) {
        createPawns(state, player1);
        createPawns(state, player2);

        createElephants(state, player1);
        createElephants(state, player2);

        createRoot(state, player1);
        createRoot(state, player2);

        createKnight(state, player2);
        createKnight(state, player1);

        createQueen(state, player1);
        createQueen(state, player2);

        createKing(state, player2);
        createKing(state, player1);
    }


    /**
     * Создаю пешки двух цветов
     * @param player
     */
    private static void createPawns(State state, Player player) {
        int numb = 2;
        if (player.getColor() == Color.BLACK)
            numb = 7;
        for (int i = 1; i < 9; i++) {
            String id = "p" + i;
            Pawn pawn = new Pawn(id, player);
            Cell c = new Cell(LETTERS[i - 1], numb);
            pawn.setCell(c);
            state.addChessman(pawn);
        }

    }

    private static final Letter[] LETTERS = Letter.values();



    /**
     * Создаю слонов двух цветов
     * @param player
     */
    private static void createElephants(State state, Player player) {
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
    private static void createRoot(State state, Player player) {
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
    private static void createKnight(State state, Player player) {
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
    private static void createQueen(State state, Player player) {
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
    private static void createKing(State state, Player player) {
        int numb = 1;
        if (player.getColor() == Color.BLACK)
            numb = 8;
        King king = new King("king1", player);
        Cell se = new Cell(Letter.E, numb);
        king.setCell(se);
        state.addChessman(king);
    }
}
