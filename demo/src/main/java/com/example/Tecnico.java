package com.example;


public class Tecnico extends Personale{

    String specializzazione;
    boolean interno;
    public Tecnico(String c, String co, String n, int a, String s, boolean i) {
        super(c, co, n, a);
        specializzazione = s;
        interno = i;
    }

    @Override
    public double costoOrario(){
        int anno = annoAttuale() - this.annoAssunzione;
        double costoIniziale = 0.0;
        if (this.specializzazione.equals("info-tele") || this.interno == true) 
            costoIniziale = 40.0;
        else if (this.specializzazione.equals("elet-auto") || this.interno == true) 
            costoIniziale = 50.0;
        return costoIniziale + anno;
    }

}
