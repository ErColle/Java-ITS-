package Esercizi.Ecommerce;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Prodotto> products = new ArrayList<Prodotto>();

    public void addProdotto(Prodotto p){
        int i = products.indexOf(p);
        if( i != -1){
            products.get(i).setQuantity(this.products.get(i).getQuantity() + p.getQuantity());
        } else {
            this.products.add(p);
        }
    }

    public void removeProdotto(Prodotto p){
        int i = products.indexOf(p);
        if ( i != -1 ){
            if(this.products.get(i).getQuantity() - p.getQuantity() > 1 ){
                this.products.get(i).setQuantity(this.products.get(i).getQuantity() - p.getQuantity());
            } else {
                this.products.remove(p);
            }
        } else {
            System.out.println("Prodotto non esistente");
        }
    }
}
