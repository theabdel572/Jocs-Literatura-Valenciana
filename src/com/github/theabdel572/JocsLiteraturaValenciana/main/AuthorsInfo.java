package com.github.theabdel572.JocsLiteraturaValenciana.main;

public enum AuthorsInfo {
    POMPEU_FABRA("Pompeu Fabra", new String[]{"test", "test"}, (short) 1920);

    AuthorsInfo(String name, String[] info, short year) {
        this.info = info;
        this.name = name;
        this.year = year;
    }

    private final String[] info;
    private final String name;
    private final short year;

    public short getYear() {
        return year;
    }

    public String[] getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }
}