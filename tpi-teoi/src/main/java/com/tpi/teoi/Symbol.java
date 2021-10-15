package com.tpi.teoi;

public class Symbol {

    private String name;

    private String token;

    private String type;

    private String value;

    private int size;

    public Symbol(String name, String token, String type, String value, int size) {
        this.name = name;
        this.token = token;
        this.type = type;
        this.value = value;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", size=" + size +
                '}';
    }
}
