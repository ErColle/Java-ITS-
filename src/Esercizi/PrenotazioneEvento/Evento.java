package Esercizi.PrenotazioneEvento;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String nome;
    private Date data;
    ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
    private boolean chiuso;

    public Evento(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public void aggiungiPrenotazione( ArrayList<Posto> posti, String email){
        Prenotazione p = new Prenotazione(posti, email);
        prenotazioni.add(p);
    }

    public void annullaPrenotazione(String email){
        for (Prenotazione p : prenotazioni){
            if (p.getEmail() == email){
                prenotazioni.remove(p);
            }
        }
    }

}
