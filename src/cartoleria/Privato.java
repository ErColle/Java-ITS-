package cartoleria;

public class Privato  extends Cliente{

    private double cash;

    public Privato(String anagrafica, double cash) {
        super(anagrafica);
        this.cash = cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public void paga(double importo) {
        cash -= importo;
    }

    @Override
    public String toString() {
        return "Privato{" +
                super.toString() +
                "cash=" + cash +
                '}';
    }
}
