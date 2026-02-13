package Esercizi.arcadinoe_interfaccie;

public abstract class Terrestre implements Animale {
    private String categoria;

    @Override
    public String categoria(){
        return "Terrestre";
    }

    @Override
    public String toString() {
        return "catecoria " + categoria;
    }
}
