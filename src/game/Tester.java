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
        //Field f = new Field();
        for (int i = 0; i < 8 ; i++) {
            List<Cell> row = Field.getRow(i);
            for (int j = 0; j < 8; j++) {
                Cell cell = row.get(j);
                char pic = chess.getCell().equals(cell) ? chess.getPicture() : chess.canMove(cell) ? '*' : ' ';
                System.out.print(pic);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

    }
}
