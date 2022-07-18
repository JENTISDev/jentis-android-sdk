package com.jentis.tracking.model.enums;

public enum Action {
    UDP("udp", 0),
    NEW("new", 1);

    private String stringValue;
    private int intValue;
    private Action(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}