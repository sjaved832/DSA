package com.codewithjaveed.designpatterns.adapter;

import com.codewithjaveed.designpatterns.adapter.avaFilter.Caramel;
// Composition approach - better approach
public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
