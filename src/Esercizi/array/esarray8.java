package Esercizi.array;

public class esarray8 {
    public static void main(String[] args){
//        Esercizio n. 8 – elementi diversi
//        Letti in input due array A e B, di lunghezza n ed m, stampare tutti gli elementi presenti in B, ma non in A.
        int[] a = { 1, 2, 3};
        int[] b = { 2, 3, 4, 1};
        boolean k = false;

        for(int  j : a ){
            for(int i : b ){
                if (j == i){
                    k = false;
                } else {
                    k = true;
                }
            }
            if ( k ){
                System.out.println( j );
            }
        }
    }
}
