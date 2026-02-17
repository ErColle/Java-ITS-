package mappe;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EsempioMappe {
    static void main() {

        // dizionario non ordinato
//        HashMap<Integer, Studente> mappa = new HashMap<>();

        // ordina le chiavi
        TreeMap<Integer, Studente> mappa = new TreeMap<>();

        Studente s1 = new Studente(123, "Mario", 2020);
        mappa.put(s1.getMatricola(), s1);

        Studente s2 = new Studente(231, "Merdone", 2015);
        mappa.put(s2.getMatricola(), s2);

        // stessa chiave di "Mario" lo sovrascrive
        Studente s3 = new Studente(123, "Culo", 2016);
        mappa.put(s3.getMatricola(), s3);

        //controlla se lo studente ha una matricola gia esistente
        if(!mappa.containsKey(s3.getMatricola())){
//            Studente s4 = new Studente(123, "Culo", 2016);
//            mappa.put(s4.getMatricola(), s4);
        }

        // aggiunge solo se la chiave e' assente
        mappa.putIfAbsent(s3.getMatricola(), s3);

        System.out.println(mappa);

        Set<Map.Entry<Integer, Studente>> set = mappa.entrySet();
        for(Map.Entry<Integer, Studente> entry : set){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
