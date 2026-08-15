package com.codewithjaveed.designpatterns.momento;

public class Main {
    public static void main(String[] args) {
    // Momemto pattern - Solves Undo problem - uses Single Responsibility principle
        var editor = new Originator();
        var history = new CareTaker();

        editor.setContent("a");
        editor.setFontSize("10");
        editor.setFontName("Calibri");
        history.add(editor.saveStateToMomento());

        editor.setContent("b");
        editor.setFontSize("12");
        editor.setFontName("Arial");
        history.add(editor.saveStateToMomento());

        editor.setContent("c");
        editor.setFontSize("13");
        editor.setFontName("Times");

        editor.getStateFromMomento(history.get());
        editor.getStateFromMomento(history.get());

        System.out.println(editor);
    }
}
