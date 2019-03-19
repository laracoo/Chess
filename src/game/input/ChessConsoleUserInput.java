package game.input;

import game.field.Cell;
import game.field.Letter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessConsoleUserInput implements UserInput {
    public static void main(String[] args) {
        UserInput s = new ChessConsoleUserInput();
        System.out.println(s.getNextCoordinates());

    }


    public static Cell transform(String s) {
        String let = s.substring(0, 1).toUpperCase();
        String dig = s.substring(1, 2);
        int i = Integer.parseInt(dig);

        Letter t = Letter.valueOf(let);

        return new Cell(t, i);

    }

    @Override
    public List<Cell> getNextCoordinates() {
        List<Cell> list = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);

            String sc = scanner.nextLine();
            String[] s1 = sc.trim().split("\\s+");

        for (int i = 0; i < s1.length; i++) {

            Cell c = transform(s1[i]);

            list.add(c);
        }



        return list;
    }
}


