package game;

import game.field.Cell;
import game.field.Letter;
import game.input.UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        List<Cell> list = new ArrayList<>(4);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            //s.nextLine()
            String sc = scanner.nextLine();
            String[] s1 = sc.trim().split("\\s+");
            Cell c = transform(s1[0]);
            Cell c1 = transform(s1[1]);
            list.add(c);
            list.add(c1);
        }
        System.out.println(list);
    }

    /**
     * преобразовать строку в клетку
     *
     * @param s
     * @return
     */
    public static Cell transform(String s) {
        String let = s.substring(0, 1).toUpperCase();
        String dig = s.substring(1, 2);
        //System.out.println(let + "" + dig);
        int i = Integer.parseInt(dig);
        /*
        Letter t = Letter.A;
        if (let.equalsIgnoreCase("D")) {
            t = Letter.D;
        } else if (let.equalsIgnoreCase("B")) {
            t = Letter.B;
        }
        */
        Letter t = Letter.valueOf(let);

        return new Cell(t, i);

    }
}
