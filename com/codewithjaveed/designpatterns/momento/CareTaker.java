package com.codewithjaveed.designpatterns.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Momento> states = new ArrayList<>();

    public void add(Momento state){
        states.add(state);
    }

    public Momento get() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
