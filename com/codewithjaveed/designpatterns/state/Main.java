package com.codewithjaveed.designpatterns.state;

public class Main {
    public static void main(String[] args) {
        // StatePattern - Solves drawing like app - Uses Open Closed Principle
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
