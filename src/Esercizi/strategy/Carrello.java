package Esercizi.strategy;

import java.util.ArrayList;

public class Carrello {
    ArrayList<Prodotto> c = new ArrayList<>();

    public void addProdotto(Prodotto p ){
        c.add(p);
    }

    public double totalCartPrice(ArrayList<Prodotto> e ) {
        double tot = 0;
        for (Prodotto p : e) {
            tot += p.getPrezzoUnitario() * p.getQuantitaOrdinata();
        }
        return tot;
    }
}
