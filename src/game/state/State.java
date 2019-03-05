package game.state;

import game.chessman.Chessman;
import game.field.Cell;
import game.field.Field;
import game.player.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
     * ВЫставляет фигуры на определенную им клетку
     * @param ch
     */
    public void addChessman(Chessman ch) {
        store.put(ch.getCell(), ch);
    }

    /**
     * Вернет клетку (ее номер)
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
        Chessman first = getChessman(from);
        store.remove(from);
        first.setCell(to);
        addChessman(first);
        //store.put(to, first);




    }
}
