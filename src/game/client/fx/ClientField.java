package game.client.fx;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class ClientField {
    //private static final ClientField PRIVATE_INSTANCE = new ClientField();

    private int count = 0;
    private List<FieldCell> all = new ArrayList<>();


    public FieldCell generateCell(Cell cell, Chessman chessman) {
        FieldCell fieldCell = new FieldCell(cell, chessman);
        all.add(fieldCell);

        return fieldCell;
    }






    public class FieldCell extends StackPane {
        private boolean clicked = false;
        private final Cell cell;

        public FieldCell(Cell cell, Chessman chessman) {
            this.cell = cell;
            if (chessman != null) {
                Text text = new Text(String.valueOf(chessman.getPicture()));
                text.setFont(new Font("Times New Roman", 35));
                getChildren().add(text);
            }

            setOnMouseClicked(event -> {
                changeColor();
                System.out.println(count);
            });

            setPrefWidth(40);
        }

        private void clearColor() {
            setBackground(null);
            if (clicked) {
                count--;
            }
            clicked = false;
        }

        private void changeColor() {

            if (clicked) {
                clicked = false;
                count--;
                setBackground(null);
            } else {
                clicked = true;
                count++;
                setBackground(new Background(new BackgroundFill(Color.rgb(0, 255, 76), CornerRadii.EMPTY, Insets.EMPTY)));
            }

            if (count > 2) {
                for (FieldCell fieldCell: all) {
                    fieldCell.clearColor();
                }
            }
        }
    }
}
