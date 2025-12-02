package Esercizi.array;

public class esarray4 {
    public static void main(String[] args){
//        Esercizio n. 4 – somma elementi array
//        Creare un array A di n numeri interi e popolarlo dinamicamente.
//                Calcolare e stampare:
//    • la somma di tutti gli elementi
//    • la somma degli elementi di posto pari (il posto zero viene contato nei pari!)
//    • la somma degli elementi di posto dispari
//    • la media aritmetica di tuti gli elementi

        int[] a = { 1, 2, 3, 4, 5};
        int sum = 0;
        int pari = 0;
        int dispari = 0;

        for(int i = 0; i < a.length; i++ ){
            sum += a[i];
        }

        System.out.println("Somma: " + sum);

        for(int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                pari += a[i];
            }
        }

        System.out.println("Somma pari: " + pari);

        for(int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                dispari += a[i];
            }
        }

        System.out.println("Somma dispari: " + dispari);

        double media = sum / a.length;
        System.out.println(media);

    }
}
