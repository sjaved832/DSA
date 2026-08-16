package com.codewithjaveed.designpatterns.strategy;

public class PngCompressor implements Comprosser{
    @Override
    public void compress(String fileName) {
        System.out.println("PNG Compressor");
    }
}
