package Esercizi.prenotatoreVoliThread;

import Esercizi.labancaThread.Banca;

public class Simulatore {
    static void main() {
        Assegnatore a1 = new Assegnatore();
        Cliente c1 = new Cliente("Freak", 10, a1);
        Cliente c2 = new Cliente("Epstein", 5, a1);
        Cliente c3 = new Cliente("Ciro", 3, a1);
        Cliente c4 = new Cliente("Gesu", 2, a1);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
