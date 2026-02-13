package rubricaTelefonica;

import java.util.ArrayList;

public class Rubrica {

    private ArrayList<Contatto> contatti;
    private int capacita;

    public Rubrica(int capacita){
        this.capacita = capacita;
        this.contatti = new ArrayList<>(capacita);
    }

    public void addContatto(Contatto contatto){
        this.contatti.add(contatto);
    }

    public void listaContatti(){
        for( Contatto contatto : contatti ){
            System.out.println(contatto);
        }
    }

    public int numeroContatti() {
        return contatti.size();
    }


    @Override
    public String toString() {
        return "Rubrica{" +
                "contatti=" + contatti +
                '}';
    }
}
