package oggetti;

import java.util.Date;

public class EsempioDate {
    public static void main(String[] args){

        Date current = new Date(); // data ora corrente

        Date end_lession = new Date(125, 11, 2, 19, 0 );

        System.out.println("Fine lezione: " + end_lession);

        System.out.println("Ora attuale:  " + current);

        int hours = end_lession.getHours() - current.getHours();

        int minutes = end_lession.getMinutes() - current.getMinutes();

        if (minutes < 0 ){
            hours -= 1;
            minutes += 60;
        }

        System.out.println("ore diff: " + hours );
        System.out.println("minuti diff: " + minutes);

        System.out.println("Mancano " + hours + " ore e " + minutes );

    }
}