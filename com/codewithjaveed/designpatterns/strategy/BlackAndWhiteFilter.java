package com.codewithjaveed.designpatterns.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Black and White filter applied");
    }
}
