package com.summitthai;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    private List<String> api;

    public MyCollection(List<String> list) {
        this.api = list;
    }

    public MyCollection() {
        this.api = new ArrayList<>();
    }

    public void save(String value) {
        String str = getXxx();
        this.api.add(str + " " +value);
    }

    public String search(int index) {
        return "Hello " + api.get(index);
    }

    protected String getXxx() {
        return MyUtil.getXXX();
    }
}
