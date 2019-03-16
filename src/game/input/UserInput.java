package game.input;

import game.field.Cell;

import java.util.List;

public interface UserInput {
    /**
     * получить следующие координаты от пользователя
     * @return
     */
     List<Cell> getNextCoordinates();
}
