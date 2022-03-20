package com.company;

public class Lagu {
    private String judulLagu,namaPenyanyi;

    public Lagu(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return  "Playing " + judulLagu + " Feat " + namaPenyanyi;
    }
}
