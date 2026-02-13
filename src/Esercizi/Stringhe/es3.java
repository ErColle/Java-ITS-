package Esercizi.Stringhe;

import java.util.Arrays;

public class es3 {
    static void main() {
//        Scrivere un programma che legge una stringa da tastiera e indica se la stringa inserita è palindroma,
//                cioè se contiene la stessa sequenza di caratteri leggendola da destra e da sinistra.
//                Tecnica risolutiva:
//        Creazione di una copia invertita della stringa
//        Esempi di stringhe palindrome:
//        anna >> palindromo
//        itopinonavevanonipoti >> palindromo

        String str = "ANNNA";

        char[] s = str.toCharArray();

        String reversed = "";

        for( int i = s.length - 1; i >= 0; i--){
            reversed += s[i];
        }

        char[] r = reversed.toCharArray();

        if (Arrays.equals(s, r)){
            System.out.println("Palindromo");
        } else {
            System.out.println("Non palindromo");
        }

    }
}
