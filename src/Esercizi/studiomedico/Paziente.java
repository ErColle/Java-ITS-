package Esercizi.studiomedico;

public class Paziente {
    private String nome;
    private String email;

    public void paziente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }


}
