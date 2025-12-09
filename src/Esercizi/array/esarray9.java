package Esercizi.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class esarray9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- Estrazione lotto ---
        int[] a = new int[5];

        System.out.println("Numeri della ruota:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 90) + 1; // 1-90
            System.out.print(a[i] + " ");
        }

        // --- Scelta numeri giocatore ---
        int dim;
        do {
            System.out.print("\n\nQuanti numeri vuoi giocare? (1-5): ");
            dim = sc.nextInt();
        } while (dim < 1 || dim > 5);

        int[] b = new int[dim];
        Set<Integer> usati = new HashSet<>();

        for (int j = 0; j < dim; j++) {
            int n;

            while (true) {
                System.out.print("Inserisci un numero da giocare (1-90, non ripetuto): ");
                n = sc.nextInt();

                if (n < 1 || n > 90) {
                    System.out.println("❌ Fuori range!");
                } else if (usati.contains(n)) {
                    System.out.println("❌ Numero già scelto!");
                } else {
                    usati.add(n);
                    b[j] = n;
                    break;
                }
            }
        }

        int count = 0;
        System.out.println("\nNumeri indovinati:");

        for (int k = 0; k < a.length; k++) {
            for (int j = 0; j < b.length; j++) {
                if (a[k] == b[j]) {
                    System.out.println(a[k]);
                    count++;
                }
            }
        }

        System.out.println("\nTotale numeri indovinati: " + count);
    }
}
