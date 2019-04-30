package com.myapplicationdev.android.tw_listview;

public class Module {

    private String name;
    private boolean mod;

    public Module(String name, boolean mod) {
        this.name = name;
        this.mod = mod;
    }

    public String getName() {
        return name;
    }

    public boolean isMod() {
        return mod;
    }
}
