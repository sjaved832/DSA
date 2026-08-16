package com.codewithjaveed.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage();
        storage.store("ImageFile", new JpegCompressor(), new BlackAndWhiteFilter());
        storage.store("ImageFile", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
