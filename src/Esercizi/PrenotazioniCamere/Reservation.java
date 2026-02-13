package Esercizi.PrenotazioniCamere;

public class Reservation {
    private String nomecliente;
    private int datainizio;
    private int datafine;

    public Reservation(String nomecliente, int datainizio, int datafine) {
        this.nomecliente = nomecliente;
        if (datainizio > datafine){
            this.datainizio = datainizio;
            this.datafine = datafine;
        } else {
            throw new IllegalArgumentException("Data inizo deve essere maggiore di fine. ");
        }
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(int datainizio) {
        if(datainizio >= 1 || datainizio <= 365 ) {
            this.datainizio = datainizio;
        } else {
            throw new IllegalArgumentException("Value Error");
        }
    }

    public int getDatafine() {
        return datafine;
    }

    public void setDatafine(int datafine) {
        if(datafine >= 1 || datafine <= 365 ) {
            this.datafine = datafine;
        } else {
            throw new IllegalArgumentException("Value Error");
        }
    }
}
