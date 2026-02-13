package oggetti;

public class testPersona {
    static void main() {
        Persona p = new Persona("MARIO", 10, 11.00);

        System.out.println(p);

        p.cresce();
        System.out.println(p);

        p.cresce_num(100);
        System.out.println(p);
    }
}
