package game.printer;

import game.state.State;
public interface StatePrinter {

    void printState(State state);
    void printMessage(String message);
}
