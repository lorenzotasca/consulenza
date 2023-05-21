package com.example;


public class Funzionario extends Personale{

    public Funzionario(String c, String co, String n, int a) {
        super(c, co, n, a);
    }
        
    @Override
    public double costoOrario(){
        int anno = annoAttuale() - this.annoAssunzione;
        if (anno < 10) return 70.0;
        else return 80.0;
    }

}
