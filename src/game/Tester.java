package game;

import game.chessman.Chessman;
import game.chessman.Knight;
import game.chessman.Queen;
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
        //TODO проверить оставшиеся фигуры
    }
}
