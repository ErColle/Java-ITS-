package Esercizi.studiomedico;

public class Medico {

    private String nome;
    private String specializzazione;

    public void medico(String nome, String specializzazione){
        this.nome = nome;
        this.specializzazione = specializzazione;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSpecializzazione(String specializzazione){
        this.specializzazione = specializzazione;
    }

    public String getNome(){
        return nome;
    }

    public String getSpecializzazione(){
        return specializzazione;
    }



}
