package lambda;

import java.util.ArrayList;
import java.util.List;

public class GestoreMele {
    static void main() {
        ArrayList<Mela> cassetta = new ArrayList<>();

        cassetta.add(new Mela(120, "rossa"));
        cassetta.add(new Mela(100, "rossa"));
        cassetta.add(new Mela(110, "gialla"));
        cassetta.add(new Mela(130, "verde"));
        cassetta.add(new Mela(120, "gialla"));
        cassetta.add(new Mela(100, "rossa"));
        cassetta.add(new Mela(125, "verde"));

        // filtro per colore verde
        List<Mela> risultato = filtraPerColore(cassetta);
        System.out.println("Solo mele rosse: ");
        for (Mela mela: risultato){
            System.out.println(mela);
        }

        risultato = filtraPerPeso(cassetta);
        System.out.println("Solo mele +110: ");
        for (Mela mela: risultato){
            System.out.println(mela);
        }

        risultato = filtaMele(cassetta, new CriterioColoreVerde());
        System.out.println("Solo mele verdi: ");
        for (Mela mela: risultato){
            System.out.println(mela);
        }

        risultato = filtaMele(cassetta, mela -> mela.getColore().equals("verde"));
        System.out.println("Solo mele verdi: ");
        for (Mela mela: risultato){
            System.out.println(mela);
        }

        risultato = filtaMele(cassetta, mela -> mela.getColore().equals("verde") && mela.getPeso() == 100);
        System.out.println("Solo mele verdi: ");
        for (Mela mela: risultato){
            System.out.println(mela);
        }

    }

    public static List<Mela> filtraPerColore(List<Mela> cassetta ){
        ArrayList<Mela> listaFiltrata = new ArrayList<>();
        for (Mela mela : cassetta){
            if(mela.getColore().equals("rossa") ){
                listaFiltrata.add(mela);
            }
        }
        return listaFiltrata;
    }

    public static List<Mela> filtraPerPeso(List<Mela> cassetta ){
        ArrayList<Mela> listaFiltrata = new ArrayList<>();
        for (Mela mela : cassetta){
            if(mela.getPeso() > 110 ){
                listaFiltrata.add(mela);
            }
        }
        return listaFiltrata;
    }

    public static List<Mela> filtaMele(List<Mela> cassetta, Criterio criterio){
        ArrayList<Mela> filtrata = new ArrayList<>();
        for (Mela mela : cassetta){
            if(criterio.test(mela)){
                filtrata.add(mela);
            }
        }
        return filtrata;
    }

}
