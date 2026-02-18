package Esercizi.prenotatoreVoliThread;

public class Cliente extends Thread {
    private String nome;
    private Assegnatore assegnatore;
    private int numPosti;

    public Cliente(String nome, int numPosti, Assegnatore assegnatore){
        this.assegnatore = assegnatore;
        this.nome = nome;
        this.numPosti = numPosti;
    }

    @Override
    public void run(){
        try {
            assegnatore.assegnaPosti(nome, numPosti);
        } catch (PostiNonDispException e) {
            throw new RuntimeException(e);
        }
    }

}
