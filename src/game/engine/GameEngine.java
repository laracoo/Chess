package game.engine;

import game.Utils;
import game.chessman.Chessman;
import game.chessman.Knight;
import game.field.Cell;
import game.generators.ChessmanGenerator;
import game.input.UserInput;
import game.player.Color;
import game.player.Player;
import game.printer.StatePrinter;
import game.state.State;

import java.util.List;

public class GameEngine {
    private final StatePrinter statePrinter;
    private final State state = new State();
    private final UserInput userInput;
    private final Player player1;
    private final Player player2;
    private Player whoseTurn;

    //private Chessman q1;


    public GameEngine(StatePrinter statePrinter, UserInput userInput, Player player1, Player player2) {
        this.statePrinter = statePrinter;
        this.userInput = userInput;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void init() {
        ChessmanGenerator.generateAllChessman(state, player1, player2);
        //q1 = state.getChessman()
        this.whoseTurn = player1.getColor() == Color.WHITE ? player1 : player2;
    }

    public void start() {
        while (!gameIsEnded()) {
            gameCycle();
        }

        printState();
    }

    private boolean gameIsEnded() {
        //TODO HM
        return false;
    }

    private void gameCycle() {
        printState();       //просто печатает
        printWhoseTurn();    //просто печатает


        List<Cell> cells = null;
        boolean valid = true;
        do {
            if (!valid) {
                printError();
            }
            try {
                cells = readUserInput();
                valid = checkValidTurn(cells);
            } catch (Exception e) {
                printMessage("Неизвестная клетка");
                valid = false;
            }
        } while (!valid);

        executeTurn(cells);
        changePlayer();
        //printState();
    }

    private void printState() {
        statePrinter.printState(state);
    }

    private boolean checkValidTurn(List<Cell> turn) {
        if (turn.size() != 2) {
            printMessage("Нужно 2 клетки");
            return false;
        }

        Chessman chessman = state.getChessman(turn.get(0));

        if (chessman == null) {
            printMessage("На этой клетки нет фигуры");
            return false;
        }

        if (whoseTurn.getColor() != chessman.getColor()) {
            printMessage("Сейчас не ваш ход");
            return false;
        }


        if (chessman.canMove(turn.get(1))) {
            if (chessman.getClass() != Knight.class && !Utils.lineIsFree(turn.get(0), turn.get(1), state, false)) {
                printMessage("Вы не можете туда ходить. Линия занята!");
                return false;
            }
        } else if (chessman.canEat(turn.get(1))) {
            if (chessman.getClass() != Knight.class && !Utils.lineIsFree(turn.get(0), turn.get(1), state, true)) {
                printMessage("Вы не можете туда ходить. Линия занята!");
                return false;
            }

            Chessman anotherChessman = state.getChessman(turn.get(1));
            if (anotherChessman == null || anotherChessman.getColor() == chessman.getColor()) {
                return false;
            }
        } else {
            printMessage("Эта фигура не может так ходить");
            return false;
        }

        return true;
    }

    private void printWhoseTurn() {
        printMessage("Сейчас ход игрока " + whoseTurn);
    }

    private void printMessage(String message) {
        statePrinter.printMessage(message);
    }

    private void printError() {
        printMessage("Ход неверный! Введите ход еще раз:");
    }

    private void executeTurn(List<Cell> turn) {
        state.changePosition(turn.get(0), turn.get(1));
    }

    private void changePlayer() {
        whoseTurn = whoseTurn == player1 ? player2 : player1;
    }

    private List<Cell> readUserInput() {
        return userInput.getNextCoordinates();
    }
}
