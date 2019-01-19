package game.chessman;

import game.player.Color;
import game.player.Player;

public class Pawn extends Chessman {


    public Pawn(String id, Player player) {
        super(id, player, player.getColor() == Color.WHITE ? '\u2659' : '\u265F');
    }

}
