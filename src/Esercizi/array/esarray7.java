package Esercizi.array;

public class esarray7 {
//    Esercizio n. 7 – elementi comuni
//    Letti in input due array A e B, di lunghezza n ed m, stampare tutti gli elementi comuni ad A e B.
    public static void main(String[] args){
        int[] a = { 1, 2, 3};
        int[] b = { 2, 3, 4, 1};

        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.println(j);
                }
            }
        }
    }
}
