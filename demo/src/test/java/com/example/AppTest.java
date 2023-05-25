package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    Progetto progetto = new Progetto();
    @Test
    public void testAddPersonale(){
        int prevSize = progetto.personale.size();
        progetto.addPersonale(new Dirigente("DTL15", "Tasca", "Lorenzo", 2015));
        assertTrue( prevSize == (progetto.personale.size()-1) );
    }

    @Test
    public void testDeletePersonale(){
        progetto.addPersonale(new Dirigente("DTL15", "Tasca", "Lorenzo", 2015));
        int prevSize = progetto.personale.size();
        try {
            progetto.deletePersonale("DTL15");
        } catch (Exception e) {
            fail("PersonaleNotExistException");
        }
        assertTrue( prevSize == (progetto.personale.size()+1) );
    }

    @Test
    public void testCostoTot() {
        progetto.addPersonale(new Dirigente("DTL15", "Tasca", "Lorenzo", 2015));
        progetto.addPersonale(new Funzionario("FOF21", "Oberti", "Fabio", 2021));
        progetto.addPersonale(new Funzionario("FGD06", "Gherardi", "Daniele", 2006));
        progetto.addPersonale(new Tecnico("TSG10", "Sonzogni", "Gabriele", 2010, "info-tele", true));
        progetto.addPersonale(new Tecnico("TBG14", "Bonacina", "Giorgio", 2014, "elet-auto", true));

        double costoTot = progetto.calcolaCostoTot();
        assertEquals(283.0, costoTot);
    }

}
