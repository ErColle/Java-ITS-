package cartoleria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ordine {

    private int numero;
    private static int contaNumeri;
    private LocalDate data;
    private Cliente cliente;
    private ArrayList<Articolo> merci = new ArrayList<>();
    private boolean pagato;

    public Ordine(LocalDate data, Cliente cliente) {
        this.numero = contaNumeri;
        this.data = data;
        this.cliente = cliente;
        contaNumeri++;
        this.pagato = false;
    }

    public int getNumero() {
        return numero;
    }

    public static int getContaNumeri() {
        return contaNumeri;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isPagato() {
        return pagato;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    public ArrayList<Articolo> getMerci() {
        return merci;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numero=" + numero +
                ", data=" + data +
                ", cliente=" + cliente +
                ", merci=" + merci +
                '}';
    }

    public double calcolaTotale(){
        double totale = 0;
        for (Articolo articolo : merci ){
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public void chiudi(){
        if(!pagato){
            double totale = this.calcolaTotale();
            this.cliente.paga(totale);
        }
        pagato = true;
    }


}
