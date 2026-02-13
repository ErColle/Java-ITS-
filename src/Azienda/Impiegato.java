package Azienda;

import java.util.Date;

public class Impiegato implements Comparable<Impiegato>{
    private final String nome;
    private double salario;
    private final Date dataAssuzione;

    private static int contatore;

    public String getNome() {
        return nome;
    }

    public Date getDataAssuzione() {
        return dataAssuzione;
    }

    public double getSalario() {
        return salario;
    }

    public static int getContatore() {
        return contatore;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnnoAssunzione() {
        return this.dataAssuzione.getYear() + 1900;
    }

    public void incrementaSalario(double aumento ) {
        this.salario += aumento;
    }


    public Impiegato(String nome, double salario, Date dataAssuzione) {
        this.nome = nome;
        this.salario = salario;
        this.dataAssuzione = dataAssuzione;
        contatore++;
    }

    @Override
    public String toString() {
        return "Impiegato{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", dataAssuzione=" + dataAssuzione +
                '}';
    }

    @Override
    public int compareTo(Impiegato i) {
        return this.getNome().compareTo(i.getNome());
    }
}
