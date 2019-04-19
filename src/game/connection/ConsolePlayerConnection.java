package game.connection;

public class ConsolePlayerConnection implements PlayerConnection {
    private ChessConsolePlayerInput input = new ChessConsolePlayerInput();
    private ChessConsolePlayerOutput output = new ChessConsolePlayerOutput();

    @Override
    public PlayerInput getUserInput() {
        return input;
    }

    @Override
    public PlayerOutput getUserOutput() {
        return output;
    }
}
