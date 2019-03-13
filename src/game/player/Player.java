package game.player;

public class Player {
    private final Color color;

    /**
     * Присваевает цвет игроку
     * @param color
     */
    public Player(Color color) {
        this.color = color;
    }

    /**
     * Возращает цвет игрока
     * @return
     */
    public Color getColor() {
        return color;
    }

}
