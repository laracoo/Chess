package game.field;

public enum Letter {
    A(1),
    B(2), 
    C(3), 
    D(4), 
    E(5), 
    F(6), 
    G(7), 
    H(8);

    private final int number;

    Letter(int number) {
        this.number = number;
    }

    /**
     * Возращает Номера букв от A - H
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * Возвращает букву по номеру (с 1)
     * @param i
     * @return
     */
    public static Letter getLetter(int i) {
        Letter[] values = Letter.values();
        return values[i - 1];
    }
}
