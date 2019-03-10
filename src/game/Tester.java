package game;

import game.chessman.*;
import game.field.Cell;
import game.field.Field;
import game.field.Letter;
import game.player.Color;
import game.player.Player;

import java.util.List;

public class Tester {
    public static void printChessmanMoves(Chessman chess) {
        Field f = new Field();
        for (int i = 0; i < 8 ; i++) {
            List<Cell> row = f.getRow(i);
            for (int j = 0; j < 8; j++) {
                Cell cell = row.get(j);
                char pic = chess.getCell().equals(cell) ? chess.getPicture() : chess.canMove(cell) ? '*' : ' ';
                System.out.print(pic);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queen queen = new Queen("q1", new Player(Color.WHITE));
        queen.setCell(new Cell(Letter.D, 4));
        printChessmanMoves(queen);
        System.out.println("======================");
        Knight knight = new Knight("q1", new Player(Color.WHITE));
        knight.setCell(new Cell(Letter.D, 4));
        printChessmanMoves(knight);
        System.out.println("======================");
        Bishop bishop = new Bishop("q1", new Player(Color.WHITE));
        bishop.setCell(new Cell(Letter.D, 5));
        printChessmanMoves(bishop);
        System.out.println("======================");
        Rook rook = new Rook("q1", new Player(Color.WHITE));
        rook.setCell(new Cell(Letter.D, 5));
        printChessmanMoves(rook);
        System.out.println("======================");
        King king = new King("q1", new Player(Color.WHITE));
        king.setCell(new Cell(Letter.D, 5));
        printChessmanMoves(king);
        System.out.println("======================");
        Pawn pawn = new Pawn("q1", new Player(Color.WHITE));
        pawn.setCell(new Cell(Letter.F, 2));
        printChessmanMoves(pawn);
        System.out.println("======================");
        Pawn pawn2 = new Pawn("q1", new Player(Color.WHITE));
        pawn2.setCell(new Cell(Letter.B, 4));
        printChessmanMoves(pawn2);
        System.out.println("======================");
        Pawn pawn3 = new Pawn("q1", new Player(Color.BLACK));
        pawn3.setCell(new Cell(Letter.C, 7));
        printChessmanMoves(pawn3);
        System.out.println("======================");
        Pawn pawn4 = new Pawn("q1", new Player(Color.BLACK));
        pawn4.setCell(new Cell(Letter.E, 5));
        printChessmanMoves(pawn4);


    }
}
