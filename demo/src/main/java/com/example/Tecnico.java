package com.example;

import java.util.*;

public class Tecnico {
    int codice;
    String cognome;
    String nome;
    Date annoAssunzione;

    public Tecnico(int c, String co, String n){
        codice = c;
        cognome = co;
        nome = n;
        this.annoAssunzione = new Date();
    }
}
