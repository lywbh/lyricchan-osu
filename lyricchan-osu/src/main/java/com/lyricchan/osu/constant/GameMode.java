package com.lyricchan.osu.constant;

public enum GameMode {

    OSU("0"),
    TAIKO("1"),
    CATCH("2"),
    MANIA("3");

    private String value;

    private GameMode(String mod) {
        this.value = mod;
    }

    public String toString() {
        return value;
    }
}
