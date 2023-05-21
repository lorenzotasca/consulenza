package com.example;

import java.util.*;

public class Progetto {
    
    LinkedList<Dirigente> dirigenti;
    LinkedList<Funzionario> funzionari;
     //specialization   //interno-esterno
    HashMap<String, HashMap<Boolean, LinkedList<Tecnico>>> tecnici;
    
    //LinkedList<Personale> personale;

    public Progetto(){
        //personale = new LinkedList<>();
        dirigenti = new LinkedList<>();
        funzionari = new LinkedList<>();
        tecnici = new HashMap<>();
    }

    public void addDirigente(int codice, String cognome, String nome){
        dirigenti.add(new Dirigente(codice, cognome, nome));
    }

    public void addFunzionario(int codice, String cognome, String nome){
        funzionari.add(new Funzionario(codice, cognome, nome));
    }
    
    public void addTecnico(int codice, String cognome, String nome){
        Tecnico t = new Tecnico(codice, cognome, nome);
        tecnici.put(t., null)
    }

    
}
