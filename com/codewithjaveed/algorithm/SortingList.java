package com.codewithjaveed.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> events = new ArrayList<>();
        List<String> sortedEvents = new ArrayList<>();
        events.add("100m");
        events.add("200m");
        events.add("400m");
        events.add("300m");

        for (String event : events) {
            if (event.equals("300")) {
                sortedEvents.add(2, event);
            } else sortedEvents.add(event);
        }
        System.out.println(sortedEvents);
    }
}
