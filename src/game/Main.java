package game;


import game.client.fx.ChessApplication;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        //startGame();
        startFxClient();
    }

    private static void startGame() {
        Game game = new Game();
        game.start();
    }

    private static void startFxClient() {
        Application.launch(ChessApplication.class);

    }
}
