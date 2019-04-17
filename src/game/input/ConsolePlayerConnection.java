package game.input;

import game.printer.ChessConsolePlayerOutput;
import game.printer.PlayerOutput;

public class ConsolePlayerConnection implements PlayerConnection {
    ChessConsolePlayerInput input = new ChessConsolePlayerInput();
    ChessConsolePlayerOutput output = new ChessConsolePlayerOutput();
    @Override
    public PlayerInput userInput() {
        return input;
    }

    @Override
    public PlayerOutput userOutput() {
        return output;
    }
}
