package oggetti;

public class Persona {

    //Attributi
    private String nome;
    private int eta;
    private double  peso;

    //Costruttori
    public Persona(String nome, int eta, double peso) {
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
    }

    //getters and setters
    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if(eta > 0)
            this.eta = eta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    // metodo di formattazione porcoddio
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", peso=" + peso +
                '}';
    }

    // metodi operativi

    public void cresce() {
        eta++;
    }

    public void cresce_num(int incremento){
        this.eta += incremento;
    }

}
