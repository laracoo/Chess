package game.engine;

import game.field.Cell;
import game.generators.ChessmanGenerator;
import game.input.ChessConsoleUserInput;
import game.input.UserInput;
import game.player.Color;
import game.player.Player;
import game.printer.StatePrinter;
import game.state.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameEngine {



    private final StatePrinter statePrinter;
    private final State state = new State();
    private final UserInput userInput;
    private final Player player1;
    private final Player player2;
    private Player whoseTurn;


    public GameEngine(StatePrinter statePrinter, UserInput userInput, Player player1, Player player2) {
        this.statePrinter = statePrinter;
        this.userInput = userInput;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void init() {
        ChessmanGenerator.generateAllChessman(state, player1, player2);
        this.whoseTurn = player1.getColor() == Color.WHITE ? player1 : player2;
    }

    public void start() {
        //printState();
        gameCycle();
        /*
        while (!gameIsEnded()) {
            gameCycle();
        }
        */
    }

    private   void gameCycle() {
        printState();       //просто печатает
        printWhoseTurn();    //просто печатает


        List<Cell> cells = readUserInput();
        executeTurn(cells);
        printState();

        /*
        List<Cell> turn = readUserInput();
        boolean valid = checkValidTurn(turn);

        while (!checkValidTurn(readUserInput())) {
            printError();
            printWhoseTurn();
        }
        executeTurn();
        */
    }

    private void printState() {
        statePrinter.printState(state);
    }

    private void printWhoseTurn() {
        statePrinter.printMessage("Сейчас ход игрока "+whoseTurn);
    }

    private void printError() {
        statePrinter.printMessage("Ход неверный!");
    }

    private void executeTurn(List<Cell> turn) {
        State state = new State();
        turn = readUserInput();
        state.changePosition(turn.get(0),turn.get(1));

    }

 private List<Cell> readUserInput() {
       List<Cell> v ;
         v  = userInput.getNextCoordinates();
         return v;
    }
}
