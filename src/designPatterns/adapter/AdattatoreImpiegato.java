package designPatterns.adapter;
import azienda.Impiegato;
import java.time.LocalDate;

//ADATTA LA CLASSE DIPENDENTE ALLA CLASSE IMPIEGATO IN azienda.Impiegato

public class AdattatoreImpiegato implements Dipendente{

    private Impiegato impiegato;

    public AdattatoreImpiegato(Impiegato impiegato){
        this.impiegato = impiegato;
    }

    public Impiegato getImpiegato() {
        return impiegato;
    }

    public void setImpiegato(Impiegato impiegato) {
        this.impiegato = impiegato;
    }

    // ESERCIZIO DI ADATTAMENTO

    @Override
    public String getNominativo() {
        return this.impiegato.getNome();
    }

    @Override
    public double getRetribuzioneAnnua() {
        return this.impiegato.getSalario() * 12;
    }

    @Override
    public int getAnniAnzianita() {
        return LocalDate.now().getYear() - this.impiegato.getAnnoAssunzione();
    }

    @Override
    public String toString() {
        return "AdattatoreImpiegato{" +
                "impiegato=" + impiegato.getNome() +
                '}' +
                " Nominativo: " + getNominativo() +
                " Retribuzione annua: " + getRetribuzioneAnnua() +
                " Anzianita: " + getAnniAnzianita();
    }
}
