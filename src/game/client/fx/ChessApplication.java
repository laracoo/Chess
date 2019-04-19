package game.client.fx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ChessApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
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


        VBox v1 = new VBox();
        v1.getChildren().addAll(getTexts());

        VBox v2 = new VBox();
        v2.getChildren().addAll(getTexts());
        v2.setSpacing(30);

        VBox v3 = new VBox();
        v3.getChildren().addAll(getTexts());

        //root.setMaxWidth(400);
        //root.setPrefWidth(900);

        root.getChildren().addAll(v1, v2, v3);


        //root.getChildren().addAll(getTexts());


        Scene scene = new Scene(root);
        return scene;
    }

    private List<Node> getTexts() {
        List result = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            result.add(new Text("label_"+(i+1)));
        }
        return result;
    }
}
