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

    public int getNumber() {
        return number;
    }
}
