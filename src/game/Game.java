package game;

import game.chessman.Elephant;
import game.chessman.Pawn;
import game.field.Cell;
import game.field.Field;
import game.player.Color;
import game.player.Player;
import game.printer.StatePrinter;
import game.state.State;

public class Game {
    private StatePrinter statePrinter;
    private State state  = new State();


    private Field field;
    private Player player1 = new Player(Color.WHITE);
    private Player player2 = new Player(Color.BLACK);


    public void start() {
        createPawns(player2);
        createPawns(player1);

        System.out.println(state);

        System.out.println("Игра началась");
        //statePrinter.printState(state);




    }

    private void createPawns(Player player) {
        Cell.Letter[] values = Cell.Letter.values();
        int numb = 2;
        if (player.getColor() == Color.BLACK)
            numb = 7;
        for (int i = 1; i < 9 ; i++) {
            String id = "p" + i;
            Pawn pawn = new Pawn(id, player);
            Cell c = new Cell(values[i-1], numb);
            pawn.setCell(c);
            state.addChessman(pawn);
        }

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    private void createElephants(Player player) {
        Elephant elephant = new Elephant("e1", player);
        state.addChessman(elephant);
        elephant = new Elephant("e2", player);
        state.addChessman(elephant);
    }


}
