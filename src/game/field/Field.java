package game.field;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<List<Cell>> field = new ArrayList<>();

    /**
     * создание восьми списков с номерами клетки
     */
    public Field() {
        for (int i = 8; i > 0; i--) {
            List<Cell> row1 = generateRow(i);
            field.add(row1);
        }
    }

    /**
     * Создаем лист котрый состоит из 8 листов в которых в каждом 8 элементов
     * @param g
     * @return
     */
    private List<Cell> generateRow(int g) {
        List<Cell> row1 = new ArrayList<>();

        Letter[] values = Letter.values();

        for (int i = 0; i < 8 ;i++) {

            Cell one = new Cell(values[i], g);
            row1.add(one);

        }

        return row1;
    }

    /**
     * Возращает линию из клеток нашего поля
     * @param num
     * @return
     */
    public List<Cell> getRow(int num) {
        return field.get(num);
    }

    /**
     * возвращает клетку по координатам
     * @param num
     * @param let
     * @return
     */
    public Cell getCell(int let, int num) {
        return field.get(8-num).get(let-1);
    }
}
