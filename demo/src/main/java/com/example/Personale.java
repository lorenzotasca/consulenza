package com.example;

import java.util.Date;

public class Personale {
    int codice;
    String cognome;
    String nome;
    Date annoAssunzione;

    public Personale(int c, String co, String n){
        codice = c;
        cognome = co;
        nome = n;
        this.annoAssunzione = new Date();
    }
}
