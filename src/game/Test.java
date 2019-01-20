package game;

import game.player.Player;

public class Test {
    public static void main(String[] args) {
        Character c = '\u2654';
        System.out.print(c);  //♔
        System.out.println(" "+(int)c.charValue());  //♔
        c++;
        System.out.println(c);  //♕
        c++;
        System.out.println(c);  //♖
        c++;
        System.out.println(c);  //♗
        c++;
        System.out.println(c);  //♘
        c++;
        System.out.println(c);  //♙
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);

        System.out.printf("%-4s%-4s%-4s%-4s%-4s\n", "p1", "p2", "p3", "p4", "p5");
        System.out.printf("%-4s%-4s%-4s%-4s%-4s\n", "p1", "K", "F", "p4", "p5");
    }
}
