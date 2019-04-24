package game.engine;

import game.Utils;
import game.chessman.Chessman;
import game.chessman.King;
import game.chessman.Knight;
import game.connection.GameInputException;
import game.field.Cell;
import game.field.Letter;
import game.generators.ChessmanGenerator;
import game.player.Color;
import game.player.Player;
import game.state.State;

import java.util.List;

public class GameEngine {
    private final State state = new State();
    private final Player player1;
    private final Player player2;
    private Player whoseTurn;

    private King kingWhite;
    private King kingBlack;


    public GameEngine(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void init() {
        ChessmanGenerator.generateAllChessman(state, player1, player2);
        Chessman chessman = state.getChessman(new Cell(Letter.E, 1));
        if (chessman instanceof King) {
            kingWhite = (King) chessman;
        }
        chessman = state.getChessman(new Cell(Letter.E, 8));
        if (chessman instanceof King) {
            kingBlack = (King) chessman;
        }
        this.whoseTurn = player1.getColor() == Color.WHITE ? player1 : player2;
    }

    public void start() {
        while (!gameIsEnded()) {
            gameCycle();
        }
        printMessage("Игра окончена!");
        printMessage("Выиграл игрок " + (kingBlack.isAlive() ? kingBlack.getOwner() : kingWhite.getOwner()));
        printState();
    }

    private boolean gameIsEnded() {
        if (!kingBlack.isAlive() || !kingWhite.isAlive()) {
            return true;
        }
        return false;
    }

    private void gameCycle() {
        printState(whoseTurn);       //просто печатает
        printWhoseTurn(whoseTurn);    //просто печатает


        List<Cell> cells = null;
        boolean valid = true;
        do {
            if (!valid) {
                printError(whoseTurn);
            }

            try {
                cells = readUserInput(whoseTurn);
                valid = checkValidTurn(cells);
            //} catch (GameInputException | IOException e) {
            } catch (GameInputException e) {
                printMessage(whoseTurn, e.getMessage());
                //printMessage(whoseTurn, e.getCause().getMessage());
                valid = false;
            }

        } while (!valid);

        executeTurn(cells);
        changePlayer();

        if (check(kingBlack.getOwner() == whoseTurn ? kingBlack : kingWhite)) {
            printMessage(whoseTurn, "Шах " + whoseTurn);
        }
    }

    /**
     * Проверка шаха
     **/
    private boolean check(King king) {
        Cell kingCell = king.getCell();
        List<Chessman> c = state.getAllChessman(king.getColor() == Color.BLACK ? Color.WHITE : Color.BLACK);
        for (int i = 0; i < c.size(); i++) {
            Chessman k = c.get(i);
            if (
                    k.canEat(kingCell) &&
                            (k.getClass() == Knight.class
                                    || Utils.lineIsFree(k.getCell(), kingCell, state, true))
            ) {
                return true;
            }
        }

        return false;
    }

    private void printState(Player player) {
        player.getPlayerOutput().send(state);
    }

    private void printState() {
        player1.getPlayerOutput().send(state);
        player2.getPlayerOutput().send(state);
    }

    private boolean checkValidTurn(List<Cell> turn) {
        if (turn.size() != 2) {
            printMessage(whoseTurn, "Нужно 2 клетки");
            return false;
        }

        Chessman chessman = state.getChessman(turn.get(0));

        if (chessman == null) {
            printMessage(whoseTurn, "На этой клетки нет фигуры");
            return false;
        }

        if (whoseTurn.getColor() != chessman.getColor()) {
            printMessage(whoseTurn, "Эта не ваша фигура");
            return false;
        }


        if (chessman.canMove(turn.get(1))) {
            if (chessman.getClass() != Knight.class && !Utils.lineIsFree(turn.get(0), turn.get(1), state, false)) {
                printMessage(whoseTurn, "Вы не можете туда ходить. Линия занята!");
                return false;
            }
        } else if (chessman.canEat(turn.get(1))) {
            if (chessman.getClass() != Knight.class && !Utils.lineIsFree(turn.get(0), turn.get(1), state, true)) {
                printMessage(whoseTurn, "Вы не можете туда ходить. Линия занята!");
                return false;
            }

            Chessman anotherChessman = state.getChessman(turn.get(1));
            if (anotherChessman == null || anotherChessman.getColor() == chessman.getColor()) {
                return false;
            }
        } else {
            printMessage(whoseTurn, "Эта фигура не может так ходить");
            return false;
        }

        return true;
    }

    private void printWhoseTurn(Player player) {
        printMessage(player, "Сейчас ход игрока " + whoseTurn);
    }

    private void printMessage(Player player, String message) {
        player.getPlayerOutput().send(message);
    }

    private void printMessage(String message) {
        player1.getPlayerOutput().send(message);
        player2.getPlayerOutput().send(message);
    }

    private void printError(Player player) {
        printMessage(player, "Ход неверный! Введите ход еще раз:");
    }

    private void executeTurn(List<Cell> turn) {
        state.changePosition(turn.get(0), turn.get(1));
    }

    private void changePlayer() {
        whoseTurn = whoseTurn == player1 ? player2 : player1;
    }

    private List<Cell> readUserInput(Player player) throws GameInputException {
        return player.getPlayerInput().readNextTurn();

    }
}
