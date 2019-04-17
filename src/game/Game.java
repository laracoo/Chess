package game;

import game.engine.GameEngine;
import game.input.ChessConsolePlayerInput;
import game.input.ConsolePlayerConnection;
import game.input.PlayerConnection;
import game.input.PlayerInput;
import game.player.Color;
import game.player.Player;
import game.printer.ChessConsolePlayerOutput;
import game.printer.PlayerOutput;

/**
 * Основной клас игры, оболочка (задает параметры игры)
 */
public class Game {
    private GameEngine gameEngine;


    //TODO HM добавить интерфейс + реализацию
    private PlayerConnection userConnection = new ConsolePlayerConnection();

    private Player player1 = new Player(Color.WHITE, userConnection);
    private Player player2 = new Player(Color.BLACK, userConnection);

    /**
     * Создает фигуры каждому игроку по цветам
     */
    public void start() {
        System.out.println("Игра началась");
        gameEngine = new GameEngine(player1, player2);
        gameEngine.init();
        gameEngine.start();
    }
}
