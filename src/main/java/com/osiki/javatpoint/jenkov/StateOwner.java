package com.osiki.javatpoint.jenkov;

public class StateOwner {

    public void addStateListener(StateChangeListener listener){
        System.out.println("change state");

    }


    public static void main(String[] args) {
        StateOwner stateOwner = new StateOwner();
        stateOwner.addStateListener(
                ((oldState, newState) -> System.out.println("state changed"))
        );
    }
}
