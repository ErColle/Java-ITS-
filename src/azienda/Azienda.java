package azienda;

import java.util.ArrayList;

public class Azienda {

    private String nome;
    private ArrayList<Impiegato> dipendenti;

    public Azienda(String nome) {
        this.nome = nome;
        this.dipendenti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Impiegato> getDipendenti() {
        return dipendenti;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Nome azienda: " + this.nome + "\n");
        s.append("elenco dipendenti: \n");
        for(Impiegato impiegato : dipendenti){
            s.append(impiegato.toString()).append("\n");
        }
        return s.toString();
    }

    public void assume(Impiegato impiegato) {
        this.dipendenti.add(impiegato);
    }

    public void incrSalarioPerTutti(double aumento){
        for (Impiegato impiegato : dipendenti){
            impiegato.incrementaSalario(aumento);
        }
    }

}
