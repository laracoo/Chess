package game;

import game.chessman.*;
import game.engine.GameEngine;
import game.field.Cell;
import game.field.Field;
import game.field.Letter;
import game.input.ChessConsoleUserInput;
import game.input.UserInput;
import game.player.Color;
import game.player.Player;
import game.printer.ChessConsoleStatePrinter;
import game.printer.StatePrinter;
import game.state.State;

/**
 * Основной клас игры, оболочка (задает параметры игры)
 */
public class Game {
    private StatePrinter statePrinter = new ChessConsoleStatePrinter();
    private GameEngine gameEngine;

    private UserInput userInput = new ChessConsoleUserInput();

    private Player player1 = new Player(Color.WHITE);
    private Player player2 = new Player(Color.BLACK);

    /**
     * Создает фигуры каждому игроку по цветам
     */
    public void start() {
        System.out.println("Игра началась");

        gameEngine = new GameEngine(statePrinter, userInput, player1, player2);
        gameEngine.init();
        gameEngine.start();
    }
}
