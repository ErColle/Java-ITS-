package Azienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EsempioComparable {
    static void main() {
        ArrayList<Impiegato> lista = new ArrayList<>();
        lista.add(new Impiegato("mario", 1500, new Date()));
        lista.add(new Impiegato("anna", 2000, new Date()));
        lista.add(new Impiegato("giulia", 1300, new Date()));

        Collections.sort(lista);
    }
}
