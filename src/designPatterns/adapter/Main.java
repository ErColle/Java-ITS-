package designPatterns.adapter;

import azienda.Impiegato;

import java.util.Date;

public class Main {
    static void main() {

        Impiegato i = new Impiegato( "Epstein", 1400, new Date(120,20,30));
        System.out.println(i);

        AdattatoreImpiegato ai = new AdattatoreImpiegato(i);
        System.out.println(ai);
    }
}
