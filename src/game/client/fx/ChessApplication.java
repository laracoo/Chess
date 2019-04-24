package game.client.fx;

import game.generators.ChessmanGenerator;
import game.player.Player;
import game.state.State;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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

        //root.setMaxWidth(400);
        //root.setPrefWidth(900);

        root.getChildren().addAll(getLeftPanel(), new SplitPane(), getRightPanel());


        //root.getChildren().addAll(getTexts());


        Scene scene = new Scene(root);
        return scene;
    }

    private Node getLeftPanel()  {
        VBox vBox = new VBox();
        StackPane stackPane = new StackPane();
        stackPane.setBackground(new Background(new BackgroundFill(Color.rgb(40, 230, 40), CornerRadii.EMPTY, Insets.EMPTY)));
        Text b1 = new Text("\u2657");
        b1.setFont(new Font("Times New Roman", 35));
        Text b2 = new Text("\u2657");
        Button b3 = new Button("\u2657");
        //b3.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.web("#009923"), CornerRadii.EMPTY, new Insets(10, 10, 10, 10))));
        vBox.getChildren().addAll(b1, b2, b3);
        b1.setOnMouseClicked(event -> {
            System.out.println("clicked");
            b1.setFill(Color.color(0.5, 0.2, 0.3));
        });
        return vBox;
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
