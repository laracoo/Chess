package game.printer;

import game.state.State;

public class ConsoleStatePrinter implements StatePrinter {
    @Override
    public void printState(State state) {
        System.out.println(state);

    }
}
