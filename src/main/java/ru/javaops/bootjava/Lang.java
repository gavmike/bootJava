package ru.javaops.bootjava;

public enum Lang {
    RU,
    EN;

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
