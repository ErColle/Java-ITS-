package Esercizi.tamagotchi;

public class Tamagotchi {

    //attributi
    final String nome;
    private String specie;
    private int peso;
    private int altezza;
    private int energia = 3;

    public Tamagotchi(String nome, String specie){
        this.nome = nome;
        this.specie = specie;

        switch(specie){
            case "cane":
                this.specie = "cane";
                this.altezza = 20;
                this.peso = 300;
                break;
            case "gatto":
                this.specie = "gatto";
                this.altezza = 10;
                this.peso = 100;
                break;
            case "canarino":
                this.specie = "canarino";
                this.altezza = 3;
                this.peso = 10;
                break;
            case "coniglio":
                this.specie = "coniglio";
                this.altezza = 10;
                this.peso = 100;
                break;
            default:
                this.specie = "cane";
                this.altezza = 20;
                this.peso = 300;
                break;
        }

    }
    public Tamagotchi(String nome){
        this.nome = nome;
        this.specie = "cane";
        this.altezza = 20;
        this.peso = 300;
    }



    @Override
    public String toString() {
        return "Tamagotchi{" +
                "nome='" + nome + '\'' +
                ", specie='" + specie + '\'' +
                ", peso=" + peso +
                ", altezza=" + altezza +
                ", energia=" + energia +
                '}';
    }
}
