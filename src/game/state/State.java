package game.state;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.player.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * хранит состояние игры
 */
public class State {
    //private Field field = new Field();

    //cell -> chessman
    //      тип переменной      имя переменной      ее реализация
    private Map<Cell, Chessman> store = new HashMap<>();

    //      тип     имя     арг

    /**
     * ВЫставляет фигуры на определенную им клетку и возвращаем предыдущую фигуру на новой клетке
     * @param ch
     */
    public Chessman addChessman(Chessman ch) {
        Cell cell = ch.getCell();
        Chessman put = store.put(cell, ch);
        return put;
    }

    /**
     * Вернет фигуру (по ее клетке)
     * @param c
     * @return
     */
    public Chessman getChessman(Cell c) {
        return store.get(c);
    }

    /**
     * Вернет фигуру (по координатам)
     * @param
     * @return
     */
    public Chessman getChessman(int let, int num) {
        Cell c = Field.getCell(let, num);
        return store.get(c);
    }


    @Override
    public String toString() {
        return store.toString();
    }

    /**
     * Изменяем позицию фигуры с клетки from на клетку to
     * @param from
     * @param to
     */
    public void changePosition(Cell from, Cell to) {
        Chessman chFrom = getChessman(from);
        store.remove(from);
        chFrom.setCell(to);
        Chessman chTo = addChessman(chFrom);
        if (chTo != null) {
            chTo.setEatenBy(chFrom);
            System.out.println(chTo + " съедена "+ chFrom);
        }
    }

    public List<Chessman> getAllChessman(Color color) {
        return store.values().stream().filter(chessman -> chessman.getColor() == color).collect(Collectors.toList());
    }

    public List<Chessman> getAllChessman() {
        return new ArrayList<>(store.values());
    }

}
