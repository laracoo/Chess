package game.input;

import game.printer.PlayerOutput;

public interface PlayerConnection {
    PlayerInput userInput();
    PlayerOutput userOutput();
}
