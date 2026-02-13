package Esercizi.studiomedico;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;


public class Gestoreambulatorio{

    ArrayList<Medico> medici = new ArrayList<>();
    ArrayList<Appuntamento> appuntamenti = new ArrayList<>();

    public void prenotaAppuntamento(String nomeMedico, String emailPaziente, LocalDate data, String ora) throws MedicoNonEsiste, AppuntamentoNonValido {
        if (nomeMedico == null || emailPaziente == null) {
            throw new NullPointerException("Medico o Email paziente vuoti");
        }

        Boolean trovato = false;
        for (Medico medico : medici) {
            if (medico.getNome() == nomeMedico) {
                trovato = true;
                break;
            }
        }
        if (trovato == false) {
            throw new MedicoNonEsiste("Medico non esiste");
        }

        for (Appuntamento app : appuntamenti) {
            if (app.getMedico().equals(nomeMedico) && app.getOra().equals(data) && app.getDate().equals(data)) {
                throw new AppuntamentoNonValido("Appuntamento non valido.");
            }
        }

        for (Appuntamento app : appuntamenti) {
            if (app.getPaziente().getEmail().equals(emailPaziente) && app.getOra().equals(data) && app.getDate().equals(data)) {
                throw new AppuntamentoNonValido("Appuntamento non valido.");
            }
        }
    }
}
