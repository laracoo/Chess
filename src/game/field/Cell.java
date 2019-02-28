package game.field;

public class Cell {

    public Cell(Letter let, int num) {
        this.num = num;
        this.let = let;
    }

    private final int num;
    private final Letter let;

    public int getNum() {
        return num;
    }


    public Letter getLet() {
        return let;
    }

    public enum Letter {
        A,B,C,D,E,F,G,H
    }

    /**
     * печатаю координаты фигур
     * @return
     */
    @Override
    public String toString() {
        return let + "" + num;
    }

    /**
     * Получаем объект клетку
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (num != cell.num) return false;
        return let == cell.let;
    }

    /**
     * ????????????????77
     * @return
     */
    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + let.hashCode();
        return result;
    }
}
