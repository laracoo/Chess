package game.player;

import game.input.PlayerInput;
import game.printer.PlayerOutput;

public class Player {
    private final Color color;
    private final PlayerOutput playerOutput;
    private final PlayerInput playerInput;

    /**
     * Присваевает цвет игроку
     * @param color
     * @param playerOutput
     * @param playerInput
     */
    public Player(Color color, PlayerOutput playerOutput, PlayerInput playerInput) {
        this.color = color;
        this.playerOutput = playerOutput;
        this.playerInput = playerInput;
    }

    public PlayerOutput getPlayerOutput() {
        return playerOutput;
    }

    public PlayerInput getPlayerInput() {
        return playerInput;
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
