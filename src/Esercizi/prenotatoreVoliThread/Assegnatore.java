package Esercizi.prenotatoreVoliThread;

import java.util.ArrayList;

public class Assegnatore {

    private int postiDisponibili = 20;

    public int getPostiDisponibili(){ return postiDisponibili; }

    synchronized public void assegnaPosti(String cliente, int numPosti) throws PostiNonDispException {

        if(getPostiDisponibili() < numPosti){
            throw new PostiNonDispException(cliente + ": Numero posti non disponibili.");
        }
        postiDisponibili -= numPosti;
        System.out.println(cliente + " assegnati " + numPosti + " posti.");
        System.out.println("Posti disponibili: " + getPostiDisponibili());
    }
}
