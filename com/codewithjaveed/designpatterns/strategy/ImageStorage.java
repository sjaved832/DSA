package com.codewithjaveed.designpatterns.strategy;

public class ImageStorage {
    public void store(String fileName, Comprosser comprosser, Filter filter) {
        comprosser.compress(fileName);
        filter.apply(fileName);
    }
}
