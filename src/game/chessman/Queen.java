package game.chessman;

import game.player.Color;
import game.player.Player;

public class Queen extends Chessman {
    public Queen(String id, Player player) {
        super(id, player,player.getColor() == Color.WHITE ? '\u2655' : '\u265B');
    }
}
