package game;

import game.engine.GameEngine;
import game.connection.ConsolePlayerConnection;
import game.connection.PlayerConnection;
import game.player.Color;
import game.player.Player;

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
