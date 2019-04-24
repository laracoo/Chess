package game.connection;

public class GameInputException extends Exception {

    public GameInputException() {
    }

    public GameInputException(String message) {
        super(message);
    }

    public GameInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameInputException(Throwable cause) {
        super(cause);
    }

    public GameInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
