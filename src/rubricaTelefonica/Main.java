package rubricaTelefonica;

import java.lang.classfile.CodeTransform;

public class Main {
    static void main() {

    Rubrica rubrica = new Rubrica(10);
    Contatto contatto1 = new Contatto("piro", "sjksj", "3892892");
    Contatto contatto2 = new Contatto("ajhajhaj", "asjhajsh", "2390476");

    rubrica.addContatto(contatto1);
    rubrica.addContatto(contatto2);

    System.out.println(rubrica);
    rubrica.listaContatti();
    System.out.println(rubrica.numeroContatti());
    }
}
