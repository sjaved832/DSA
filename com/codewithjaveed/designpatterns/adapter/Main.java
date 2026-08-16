package com.codewithjaveed.designpatterns.adapter;

import com.codewithjaveed.designpatterns.adapter.avaFilter.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
        //imageView.apply(new CaramelAdapter());
    }
}
