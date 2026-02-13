package oggetti;

import java.util.Scanner;

public class EsempioArray {
    public static void main(String[] args){
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++ ){
            System.out.print("Inserisci un numero intero: ");
           array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }

        char[] nome = { 'a', 'n', 'n', 'a'};

        for (int i = 0; i < nome.length; i++ ) {
            System.out.print(nome[i]);
        }

        for ( char c : nome ){
            System.out.print(c);
        }
    }
}
