package game.chessman;

import game.player.Color;
import game.player.Player;

public class King extends Chessman {

    public King(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2654' : '\u265A');
    }
}
