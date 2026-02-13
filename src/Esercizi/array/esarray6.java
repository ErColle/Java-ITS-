package Esercizi.array;

public class esarray6 {
    public static void main(String[] args){
//        Esercizio n. 6 - inversione array vers.2
//        Letto in input un array A di n numeri interi, invertire l’ordine degli elementi.
//                NB: utilizzare il SOLO array iniziale.

        int[] a = { 1, 2, 3, 4, 5};

        for(int i = 0; i < a.length / 2; i++){
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;

        }
        for ( int n : a ){
            System.out.println(n);
        }
    }
}
