package cartoleria;

public class Azienda  extends Cliente{

    private double saldoCC;

    public Azienda(String anagrafica, double saldoCC) {
        super(anagrafica);
        this.saldoCC = saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    public double getSaldoCC() {
        return saldoCC;
    }

    @Override
    public void paga(double importo) {
        double commissione = importo/10;
        saldoCC -= saldoCC - (importo - commissione);
    }

    @Override
    public String toString() {
        return "Azienda{" +
                super.toString() +
                "saldoCC=" + saldoCC +
                '}';
    }
}
