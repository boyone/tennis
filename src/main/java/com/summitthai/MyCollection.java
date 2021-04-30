package com.summitthai;

import java.util.List;

public class MyCollection {
    private List<String> list;

    public MyCollection(List<String> list) {
        this.list = list;
    }

    public void save(String string) {
        this.list.add(string);
    }

    public String search(int index) {
        return list.get(index);
    }
}
