package Esercizi.Stringhe;

public class es4 {
    static void main() {
//        Scrivere un programma in cui, dati in input una stringa e un carattere, viene stampato il numero di occorrenze del carattere nella stringa
//        Scrivere 2 implementazioni, usando le seguenti tecniche:
//        Usare il metodo charAt(int)
//        Usare il metodo indexOf(char, int)
//
//        Esempio
//        aaabbbccc , b  >> 3 occorrenze
//        aaabbbccc , x  >> 0 occorrenze
//        abcabcabc , a  >> 3 occorrenze

        String s = "sssslllslkk";
        char c = 's';
        int count = 0;

//        for( int i = 0; i < s.length(); i++ ){
//            if (s.charAt(i) == c){
//                count += 1;
//            }
//        }

        for( int i = 0; i < s.length(); i++ ){
            int y = s.indexOf(c, i);
            if ( y == -1){
                break;
            }
            count++;
            i = y;
        }
        
        System.out.println(count);

   }
}
