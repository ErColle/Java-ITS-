package Esercizi.PrenotazioniCamere;

import java.util.ArrayList;

public class Room {
    private int number;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Room(int number) {
        if (number >= 100 && 599 <= number) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("numero di camera tra 100 e 599");
        }
    }

    public Reservation reservation(String nome, int datainizio, int datafine){
        for(Reservation r : reservations ){
            if(datainizio >= r.getDatainizio() && datainizio <r.getDatafine()){
                throw new IllegalArgumentException("Camera gia prenotata.");
            } else if(datafine >=r.getDatafine() && datafine <= r.getDatafine()){
                throw new IllegalArgumentException("Camera gia prenotata.");
            }
        }
        Reservation r = new Reservation(nome, datainizio, datafine);
        reservations.add(r);

        return r;
    }

    public ArrayList<Reservation>getReservations(){
        return this.reservations;
    }
}