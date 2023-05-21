package com.example;

import java.util.function.Supplier;

public class Dirigente extends Personale{

    public Dirigente(String c, String co, String n, int a) {
        super(c, co, n, a);
    }

    public Supplier<Double> costOrario = () -> (100.0);
    @Override
    public double costoOrario(){
        return costOrario.get();
    }
    
}
