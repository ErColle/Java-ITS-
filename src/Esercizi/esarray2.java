package Esercizi;

import java.util.Scanner;

public class esarray2 {
    public static void main(String[] args) {
//        Esercizio n. 2 - inversione array
//        Letto in input un array A di n numeri interi, creare un secondo array B della stessa dimensione e popolarlo invertendo l’ordine degli elementi del primo.
//                Esempio: se A è (10,27,13, 4), allora devo ottenere B (4,13,27,10)
//        Al termine dell’elaborazione stampare gli array A e B.

        int[] a = { 1, 2, 3, 4, 5 };

        System.out.println("Array a");

        for ( int n : a ){
            System.out.println(n);
        }

        int[] b = new int[5];

        for(int i = b.length - 1; i >= 0 ; i--){
            b[i] = a [a.length - 1 - i];
        }

        System.out.println("Array b");

        for ( int n : b ){
            System.out.println(n);
        }
    }
}
