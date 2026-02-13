package Esercizi.studiomedico;

import java.time.LocalDate;

public class Appuntamento {

    private Medico medico;
    private Paziente paziente;
    private LocalDate date;
    private String ora;

    public Appuntamento(Medico medico, Paziente paziente, LocalDate date, String ora) {
        this.medico = medico;
        this.paziente = paziente;
        this.date = date;
        this.ora = ora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}


