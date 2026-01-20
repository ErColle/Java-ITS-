package Esercizi.Stringhe;

public class es1 {
    static void main() {
        String str = "siusi 17282";
        char[] charArray = str.toCharArray();
        boolean flag = true;

        for( char c : charArray){
            if ( Character.isLetter(c) ){
                System.out.println("Testo NON numerico");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("testo numerico");
        }
    }
}
