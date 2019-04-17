package game.player;

import game.input.ConsolePlayerConnection;
import game.input.PlayerConnection;
import game.input.PlayerInput;
import game.printer.PlayerOutput;

public class Player {
    private final Color color;
    PlayerConnection connection = new ConsolePlayerConnection();


    /**
     * Присваевает цвет игроку
     * @param color
     *
     */
    public Player(Color color, PlayerConnection connection) {
        this.color = color;
       final PlayerConnection c = connection;

    }

    public PlayerOutput getPlayerOutput() {
        connection.userInput();
        return connection.userOutput();
    }

    public PlayerInput getPlayerInput() {
        connection.userInput();
        return connection.userInput();
    }

    /**
     * Возращает цвет игрока
     * @return
     */
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color == Color.BLACK ? "'Черный'" : "'Белый'";
    }
}
