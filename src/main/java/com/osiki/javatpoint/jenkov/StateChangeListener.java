package com.osiki.javatpoint.jenkov;

import javax.swing.plaf.nimbus.State;

public interface StateChangeListener {

    public void onListen(State oldState, State newState);
}
