package com.example;

import java.util.*;

public class Dirigente {
    int codice;
    String cognome;
    String nome;
    Date annoAssunzione;

    public Dirigente(int c, String co, String n){
        codice = c;
        cognome = co;
        nome = n;
        this.annoAssunzione = new Date();
    }

}
