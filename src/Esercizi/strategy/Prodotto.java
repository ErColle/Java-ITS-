package Esercizi.strategy;

public class Prodotto {
    private String nome;
    private int quantitaOrdinata;
    private double prezzoUnitario;

    public Prodotto(int quantitaOrdinata, double prezzoUnitario, String nome) {
        this.quantitaOrdinata = quantitaOrdinata;
        this.prezzoUnitario = prezzoUnitario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantitaOrdinata() {
        return quantitaOrdinata;
    }

    public void setQuantitaOrdinata(int quantitaOrdinata) {
        this.quantitaOrdinata = quantitaOrdinata;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(int prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
}
