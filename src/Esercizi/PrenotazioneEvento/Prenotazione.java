package Esercizi.PrenotazioneEvento;

import java.util.ArrayList;

public class Prenotazione {
    private String email;
    ArrayList<Posto> posti = new ArrayList<>();

    public Prenotazione(ArrayList<Posto> posti, String email) {
        this.posti = posti;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Posto> getPosti() {
        return posti;
    }

    public void setPosti(ArrayList<Posto> posti) {
        this.posti = posti;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "email='" + email + '\'' +
                ", posti=" + posti +
                '}';
    }
}
