package com.codewithjaveed.designpatterns.observer;

public class SpreedSheet implements Observer{

    DataSource dataSource;

    public SpreedSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified : " + dataSource.getValue());
    }
}
