package com.codewithjaveed.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    //private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    int count;

    public void push(String url) {
        //urls.add(url);
        urls[count++] = url;
    }

    public String pop() {
//        int lastUrlIndex = urls.size() - 1;
//        return urls.remove(lastUrlIndex);
        return urls[--count];
    }

    public Iterator createIterator() {
        //return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator {
//        private BrowserHistory browserHistory;
//        private int index;
//
//        public ListIterator(BrowserHistory browserHistory) {
//            this.browserHistory = browserHistory;
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//
//        @Override
//        public String current() {
//            return browserHistory.urls.get(index);
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < browserHistory.urls.size();
//        }
//    }

    public class ArrayIterator implements Iterator {

        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }
    }

}
