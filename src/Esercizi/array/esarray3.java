package Esercizi.array;

public class esarray3 {
    public static void main(String[] args){
//        Esercizio n. 3 - copia metà array
//        Creare un array A di n numeri interi, popolarlo dinamicamente SOLO per metà e stamparlo.
//        Popolare poi la seconda metà con gli stessi valori della prima e stampare nuovamente.
//        NB: per semplicità assumiamo che la dimensione dell’array sia un numero pari.
//        Es. creo un array da 10 elementi e lo popolo con questi 5 valori (3, 5, 8, 2, 4).  Alla fine l'array deve diventare (3, 5, 8, 2, 4, 3, 5, 8, 2, 4).

        int[] a = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };
//        for(int i = 0; i < (a.length / 2); i++){
//        }
        for(int i = 0 ; i < a.length / 2; i++ ){
            a[ i + a.length / 2]  = a[i];
        }

        for (int n : a ){
            System.out.println(n);
        }
    }
}
