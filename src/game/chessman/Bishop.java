package game.chessman;

import game.player.Color;
import game.player.Player;

public class Bishop extends Chessman {


    public Bishop(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2657' : '\u265D');

    }

}
