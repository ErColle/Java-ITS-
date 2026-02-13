package Esercizi.PrenotazioneEvento;

public class Posto {
    private char corsia;
    private int numero;

    public Posto(char corsia, int numero) {
        this.corsia = corsia;
        this.numero = numero;
    }

    public char getCorsia() {
        return corsia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Posto{" +
                "corsia=" + corsia +
                ", numero=" + numero +
                '}';
    }
}
