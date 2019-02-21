package game.chessman;

import game.player.Color;
import game.player.Player;

public class Knight extends Chessman {
    public Knight(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2658' : '\u265E');
    }
}
