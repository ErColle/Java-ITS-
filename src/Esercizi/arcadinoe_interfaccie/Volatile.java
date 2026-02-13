package Esercizi.arcadinoe_interfaccie;

public abstract class Volatile implements Animale {
    private String categoria;

    @Override
    public String categoria(){
        return "Volatile";
    }

    @Override
    public String toString() {
        return "catecoria " + categoria;
    }
}