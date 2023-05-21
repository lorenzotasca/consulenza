package com.example;

import java.util.Date;

public class Funzionario{
    int codice;
    String cognome;
    String nome;
    Date annoAssunzione;

    public Funzionario(int c, String co, String n){
        codice = c;
        cognome = co;
        nome = n;
        this.annoAssunzione = new Date();
    }
    
}
