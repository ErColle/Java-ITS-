package Esercizi.hotel;

public class Room {
    private int numero;
    private int piano;
    private int nPostiLetto;

    public Room(int numero, int piano, int nPostiLetto) {
        this.numero = numero;
        this.piano = piano;
        this.nPostiLetto = nPostiLetto;
    }

    public int getNumero() {
        return numero;
    }

    public int getnPostiLetto() {
        return nPostiLetto;
    }

    public int getPiano() {
        return piano;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numero=" + numero +
                ", piano=" + piano +
                ", nPostiLetto=" + nPostiLetto +
                '}';
    }

    public void setnPostiLetto(int nPostiLetto) {
        this.nPostiLetto = nPostiLetto;
    }
}
