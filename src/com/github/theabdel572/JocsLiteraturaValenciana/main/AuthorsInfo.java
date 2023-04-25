package com.github.theabdel572.JocsLiteraturaValenciana.main;

public enum AuthorsInfo {
    POMPEU_FABRA("Pompeu Fabra",
            new String[]{"Va ser el principal artífex de la normativització de la llengua catalana moderna.",
            "Va publicar diverses gramàtiques, diccionaris i manuals de la llengua catalana, basant-se en criteris científics i respectant la pronúncia i l’etimologia dels mots.",
            "La seva obra més coneguda és el Diccionari general de la llengua catalana de 1932.",
            "Va ser fundador de la Secció Filològica de l’IEC i president de la Unió Catalana de Federacions Esportives."},
            (short) 1868);

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