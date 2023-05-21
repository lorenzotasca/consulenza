package com.example;

import java.util.*;

public class Progetto {
    /*
    LinkedList<Dirigente> dirigenti;
    LinkedList<Funzionario> funzionari;
     //specialization   //interno-esterno
    HashMap<String, HashMap<Boolean, LinkedList<Tecnico>>> tecnici;
    */
    LinkedList<Personale> personale;

    public Progetto(){
        personale = new LinkedList<>();
    }

    public void addPersonale(Personale persona){
        personale.add(persona);
    }

    public void deletePersonale(String codice){
        if(!personale.stream().anyMatch(persona -> persona.codice==codice)){
            throw new PersonaleNotExistException();
        };
        for(Personale p : personale){
            if(p.codice==codice){
                personale.remove(p);
            }
        }
    }

    public double calcolaCostoTot() {
        return personale.stream()
                .mapToDouble(Personale::costoOrario)// return new Stream with all double refer to costoOrario
                .sum();// sum all double
    }
    
}
