package com.example;

import java.util.*;

public class Progetto {
    LinkedList<Dirigente> dirigenti;
    LinkedList<Funzionario> funzionari;
     //specialization   //interno-esterno
    HashMap<Integer, HashMap<Boolean, LinkedList<Tecnico>>> tecnici;

    public Progetto(){
        dirigenti = new LinkedList<>();
        funzionari = new LinkedList<>();
        tecnici = new HashMap<>();
    }

    // fare una classe Personale, dove mettere dentro tutti i dati, estenderla nelle classi Dirigente, 
    // Funzionario e Tecnico. In questa classe(Progetto), fare LinkedList<Personale> e poi da li faccio tutto
    
}
