package Esercizi.arcadinoe_interfaccie;

import java.util.ArrayList;

public class Arca {

    ArrayList<Animale> animali = new ArrayList<Animale>();

    public void salvaAnimali(Animale a){
        animali.add(a);
    }

    public int getNumeroAnimali() {
        return animali.size();
    }

    public String coro(){
        String coro = "";
        for (Animale a : animali ){
            coro += a.verso();
        }
        return coro;
    }

    public String toString(){
        String allToString = "";
        for (Animale a : animali ){
            allToString += a.toString();
        }
        return allToString;
    }
}
