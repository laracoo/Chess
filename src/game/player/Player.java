package game.player;

public class Player {
    private static Color color = Color.WHITE;

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
    public static Color getColor() {
        return color;
    }

}
