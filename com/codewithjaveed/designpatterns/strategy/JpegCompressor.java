package com.codewithjaveed.designpatterns.strategy;

public class JpegCompressor implements Comprosser{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing into JPEG");
    }
}
