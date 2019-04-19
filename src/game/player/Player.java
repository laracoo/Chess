package game.player;

import game.connection.PlayerConnection;
import game.connection.PlayerInput;
import game.connection.PlayerOutput;

public class Player {
    private final Color color;
    private PlayerConnection connection;


    /**
     * Присваевает цвет игроку
     *
     * @param color
     */
    public Player(Color color, PlayerConnection connection) {
        this.color = color;
        this.connection = connection;

    }

    public PlayerOutput getPlayerOutput() {
        return connection.getUserOutput();
    }

    public PlayerInput getPlayerInput() {
        return connection.getUserInput();
    }

    /**
     * Возращает цвет игрока
     *
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
