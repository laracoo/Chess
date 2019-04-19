package game.connection;

import game.field.Cell;
import game.field.Letter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessConsolePlayerInput implements PlayerInput {
    private final Scanner scanner = new Scanner(System.in);

    protected static Cell transform(String s) {
        String let = s.substring(0, 1).toUpperCase();
        String dig = s.substring(1, 2);
        int i = Integer.parseInt(dig);
        Letter t = Letter.valueOf(let);
        return new Cell(t, i);
    }

    @Override
    public List<Cell> readNextTurn() {
        List<Cell> list = new ArrayList<>();

        String[] s1 = scanner.nextLine().trim().split("\\s+");

        for (int i = 0; i < s1.length; i++) {

            Cell c = transform(s1[i]);

            list.add(c);
        }
        return list;
    }
}


