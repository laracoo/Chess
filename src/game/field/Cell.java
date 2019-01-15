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

    @Override
    public String toString() {
        return let + "" + num;
    }
}
