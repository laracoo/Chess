package game.connection;

import game.field.Cell;

import java.util.List;

public interface PlayerInput {
    /**
     * получить следующие координаты от пользователя
     * @return
     */
     List<Cell> readNextTurn();
}
