package game.chessman;

import game.player.Color;
import game.player.Player;

public class Rook extends Chessman {
    public Rook(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2656' : '\u265C');
    }
}
