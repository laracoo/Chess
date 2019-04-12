package game.state;

import game.chessman.Chessman;
import game.field.Cell;
import game.player.Color;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * хранит состояние игры
 */
public class State {

    // Player -> (id -> Chessman)
    //private Map<Player, Map<String, Chessman>> store = new HashMap<>();


    //cell -> chessman
    //      тип переменной      имя переменной      ее реализация
    private Map<Cell, Chessman> store = new HashMap<>();


    /*public void addChessman(Chessman c1) {
        Map<String, Chessman> innerMap = store.get(c1.getOwner());
        if (innerMap == null) {
            innerMap = new HashMap<>();
            Player key = c1.getOwner();
            store.put(key, innerMap);
        }

        String id = c1.getId();
        innerMap.put(id,c1);
    }*/

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
        /*
        List<Chessman> result = new ArrayList<>();
        Collection<Chessman> chessmen = store.values();
        for (Chessman chessman: chessmen) {
            if (chessman.getColor() == color)
                result.add(chessman);
        }
        return result;
        */
        return store.values().stream().filter(chessman -> chessman.getColor() == color).collect(Collectors.toList());
    }

}
