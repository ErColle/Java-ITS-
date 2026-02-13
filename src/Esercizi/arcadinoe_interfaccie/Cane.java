package Esercizi.arcadinoe_interfaccie;

public class Cane extends Terrestre{

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public String toString(){
        return super.toString() + "Specie : Cane";
    }
}
