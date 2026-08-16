package com.codewithjaveed.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        var source = new DataSource();
        var sheet1 = new SpreedSheet(source);
        var sheet2 = new SpreedSheet(source);
        var sheet3 = new SpreedSheet(source);
        var chart = new Chart(source);

        source.addObserver(sheet1);
        source.addObserver(sheet2);
        source.addObserver(sheet3);
        source.addObserver(chart);

        source.setValue(1);
    }
}
