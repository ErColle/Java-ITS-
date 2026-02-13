package Esercizi.PrenotazioneEvento;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class GestorePrenotazioni {
    ArrayList<Posto> posti = new ArrayList<>();
    TreeMap<Date, Evento> eventi = new TreeMap<Date, Evento>();

    public void createEvento(String nome, Date data){
        Evento e = new Evento(nome, data);
        eventi.put(data, e);
    }

    public void AggiungiPrenotazione(Date data, int numposti, String email ){


    }

}