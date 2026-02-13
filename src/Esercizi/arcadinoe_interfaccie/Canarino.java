package Esercizi.arcadinoe_interfaccie;

public class Canarino extends Volatile{

    @Override
    public String verso() {
        return "Chip Chip";
    }

    @Override
    public String toString() {
        return super.toString() + "Specie: Canarino";
    }
}
