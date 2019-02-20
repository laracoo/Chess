package game.field;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<List<Cell>> field = new ArrayList<>();

    public Field() {
        List<Cell> row1 = new ArrayList<>();
        Cell one = new Cell(Cell.Letter.A, 8);
        row1.add(one);

    }

    public List<Cell> getRow(int num) {
        return field.get(num);
    }

}
