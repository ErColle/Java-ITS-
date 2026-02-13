package Esercizi.Stringhe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci data: ");
        String data = sc.nextLine();

        int giorno = Integer.parseInt(data.substring(0, 2));
        int mese = Integer.parseInt(data.substring(3, 5));
        int anno = Integer.parseInt(data.substring(6, 10));

        LocalDate date = LocalDate.of(anno, mese, giorno);
        System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear());
    }
}
