package game.connection;

import game.state.State;

public interface PlayerOutput {

    void send(State state);
    void send(String message);

}
