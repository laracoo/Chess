package game;

import game.player.Player;

public class Test {
    public static void main(String[] args) {
        Character c = '\u2654';
        System.out.print(c);  //♔
        System.out.println(" "+(int)c.charValue());  //♔
        c++;
        System.out.println(c);  //♕ u2655       u2659, u265A, u265B
        c++;
        System.out.println(c);  //♖   ♖  ♜ 56
        c++;
        System.out.println(c);  //♗  57
        c++;
        System.out.println(c);  //♘  58
        c++;
        System.out.println(c);  //♙  59
        c++;
        System.out.println(c);// ♚ 5A
        c++;
        System.out.println(c);// ♛ 5B
        c++;
        System.out.println(c);// ♜ 5C
        c++;
        System.out.println(c);//♝  5D
        c++;
        System.out.println(c);// ♞ 5E
        c++;
        System.out.println(c);// ♟ 5F

        System.out.printf("%-4s%-4s%-4s%-4s%-4s\n", "p1", "p2", "p3", "p4", "p5");
        System.out.printf("%-4s%-4s%-4s%-4s%-4s\n", "p1", "K", "F", "p4", "p5");
    }
}
