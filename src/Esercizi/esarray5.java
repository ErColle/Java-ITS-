package Esercizi;

public class esarray5 {
    public static void main(String[] args){
//        Esercizio n. 5 – stampa zigzag
//        Letto in input un array A di n numeri interi, stampare gli elementi a zigzag, cioè il primo e l'ultimo, poi il secondo e il penultimo, e così via.
//        NB: assumiamo la dimensione pari.

        int[] a = { 1, 2, 3, 4, 5, 6};

        for(int i = 0; i < a.length / 2; i ++ ){
            System.out.println(a[i]);
            System.out.println(a[a.length - 1 - i]);
        }
    }
}