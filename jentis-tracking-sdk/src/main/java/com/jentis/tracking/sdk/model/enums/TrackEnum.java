package com.jentis.tracking.sdk.model.enums;

public enum TrackEnum {
    CONSENT("consent", 0),
    PAGEVIEW("pageview", 1),
    SUBMIT("submit", 2),
    PRODUCT("product", 3);

    private String stringValue;
    private int intValue;
    private TrackEnum(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
