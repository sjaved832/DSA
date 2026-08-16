package com.codewithjaveed.designpatterns.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Vivid Filter applied");
    }
}
