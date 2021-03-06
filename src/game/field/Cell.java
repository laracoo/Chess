package game.field;

public class Cell {

    public Cell(Letter let, int num) {
        this.num = num;
        this.let = let;
    }

    private final int num;
    private final Letter let;

    /**
     * Возращает цифры для поле от 1 - 8
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * Возращает буквы для поля от A - H
     * @return
     */
    public Letter getLet() {
        return let;
    }

    @Override
    public String toString() {
        return let + "" + num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (num != cell.num) return false;
        return let == cell.let;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + let.hashCode();
        return result;
    }
}
