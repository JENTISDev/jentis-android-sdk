package com.jentis.tracking.model.enums;

public enum DocumentType {
    USER("user", 0),
    SESSION("session", 1),
    EVENT("event", 2),
    CONSENT("consent", 2);

    private String stringValue;
    private int intValue;
    private DocumentType(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}