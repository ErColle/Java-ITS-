package Azienda;

import java.util.Date;

public class MainImpiegato {
    static void main() {

        System.out.println(Impiegato.getContatore());

        Impiegato imp1 = new Impiegato("mirko", 1500, new Date());
        Impiegato imp2 = new Impiegato("culo", 1800, new Date());

        System.out.println(Impiegato.getContatore());
        System.out.println(imp1);

        System.out.println(imp1.getAnnoAssunzione());

        imp1.incrementaSalario(100);
        System.out.println(imp1.getSalario());

        Azienda azienda = new Azienda("CULONI");
        System.out.println(azienda);
        azienda.assume(imp1);

        System.out.println(azienda);

    }
}
