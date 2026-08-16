package com.codewithjaveed.designpatterns.adapter;

import com.codewithjaveed.designpatterns.adapter.avaFilter.Caramel;
// Inheritance approach - not a good approach because we can't extend Filter if it was a Abstract class
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
