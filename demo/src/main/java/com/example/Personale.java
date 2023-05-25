package com.example;

import java.time.LocalDate;
import java.util.function.Supplier;

public abstract class Personale {
    String codice;
    String cognome;
    String nome;
    int annoAssunzione;

    public Personale(String c, String co, String n, int a){
        codice = c;
        cognome = co;
        nome = n;
        annoAssunzione = a;
    }

    public Supplier<Double> costOrario = () -> (0.0);

    public double costoOrario(){
        return costOrario.get();
    }

    public int annoAttuale(){
        int year = LocalDate.now().getYear();
        return year;
    }

}
