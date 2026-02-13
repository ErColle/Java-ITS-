package Esercizi.array;

import java.util.Scanner;

public class esarray1 {
    public static void main(String[] args) {

//        Esercizio n. 1 – copia array
//        Letto in input un array A di n numeri interi, creare un secondo array della stessa dimensione e popolarlo copiando tutti gli elementi del primo

        int[] numeri = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci un numero: ");
            numeri[i] = sc.nextInt();
        }

        for (int i = 0; i < numeri.length; i++ ) {
            System.out.println(numeri[i]);
        }

        int[] numeri1 = new int[5];

        for (int i = 0; i < numeri1.length; i++) {
            numeri1[i] = numeri[i];
        }

        for (int i = 0; i < numeri1.length; i++ ) {
            System.out.print(numeri1[i]);
        }

    }
}

