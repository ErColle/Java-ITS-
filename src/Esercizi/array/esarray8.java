
package Esercizi.array;

public class esarray8 {
    public static void main(String[] args) {

//        Esercizio n. 8 – elementi diversi
//        Letti in input due array A e B, di lunghezza n ed m, stampare tutti gli elementi presenti in B, ma non in A.

        int[] a = { 1, 2, 3 };
        int[] b = { 2, 3, 4, 1 };

        for (int j : b) {
            boolean trovato = false;

            for (int k : a) {
                if (j == k) {
                    trovato = true;
                    break;
                }
            }

            if (!trovato) {
                System.out.println(j);
            }
        }
    }
}

