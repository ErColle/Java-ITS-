package Esercizi.traghetto;

import java.util.ArrayList;

public class biglietteria {

    private double cassa;
    ArrayList<tariffabile> coda = new ArrayList<tariffabile>();

    public void aggiungiInCoda(tariffabile t){
        coda.add(t);
    }

    public tariffabile riceviPagamento(){
        if ( coda.isEmpty() ){
            throw new IllegalArgumentException("La coda e' vuota");
        }
        return null;
    }
}
