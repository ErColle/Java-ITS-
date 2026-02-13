package Esercizi.traghetto;

public class persona implements tariffabile{
    private String nome;
    private String cognome;

    public persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double calcolaTariffa(){
        return 2.5;
    }

}
