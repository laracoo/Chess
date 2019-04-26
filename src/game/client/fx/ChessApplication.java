package game.client.fx;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.generators.ChessmanGenerator;
import game.player.Player;
import game.state.State;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ChessApplication extends Application {
    private State state = new State();
    private Player player1 = new Player(game.player.Color.WHITE, null);
    private Player player2 = new Player(game.player.Color.BLACK, null);

    @Override
    public void start(Stage primaryStage) throws Exception {
        ChessmanGenerator.generateAllChessman(state, player1, player2);


        /*
        * TODO документация по JavaFx от Oracle
        * https://docs.oracle.com/javase/8/javase-clienttechnologies.htm
        *
        * TODO примеры (1-й и 2-й)
        * https://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm
        *
        */

        primaryStage.setTitle("qwer1234");
        primaryStage.setScene(getScene());

        primaryStage.show();
    }

    private Scene getScene() {
        //VBox root = new VBox();
        HBox root = new HBox();
        root.setSpacing(20);
        root.setPrefWidth(400);
        root.setPrefHeight(400);

        //root.setMaxWidth(400);
        //root.setPrefWidth(900);

        //root.getChildren().addAll(getLeftPanel(), new Separator(Orientation.VERTICAL), getRightPanel());
        root.getChildren().addAll(getLeftPanel());


        //root.getChildren().addAll(getTexts());


        Scene scene = new Scene(root);
        return scene;
    }

    //private Field field = new Field();
    private ClientField clientField = new ClientField();

    private Node getLeftPanel()  {
        //VBox vBox = new VBox();

        HBox line = new HBox();

        List<Cell> row = Field.getRow(0);

        for (Cell cell: row) {
            Chessman chessman = state.getChessman(cell);



            StackPane guiCell = clientField.generateCell(chessman.getCell(), chessman);
            line.getChildren().addAll(new Separator(Orientation.VERTICAL), guiCell);
        }

        return line;
    }

    private Node getRightPanel() {
        VBox vBox = new VBox();
        Text text = new Text("Hello!");
        vBox.getChildren().add(text);
        return vBox;
    }

    private List<Node> getTexts() {
        List result = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            result.add(new Text("label_"+(i+1)));
        }
        return result;
    }
}
