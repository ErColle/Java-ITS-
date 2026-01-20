package Esercizi.Ecommerce;

public class ProdottoSale extends Prodotto{

    private int minquantity;
    private double discount;

    public ProdottoSale(int id, String description, int quantity, int price, int minquantity, double discount) {
        super(id, description, quantity, price);
        this.discount = discount;
        this.minquantity = minquantity;
    }

    public int getMinquantity() {
        return minquantity;
    }

    public void setMinquantity(int minquantity) {
        this.minquantity = minquantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getTotal(){
        if (this.getQuantity() > this.getMinquantity()){
            double x = (((getPrice() * getQuantity()) / 100) * this.getDiscount());
            return getTotal() - x;
        } else {
            return getTotal();
        }
    }

    @Override
    public String toString() {
        return "ProdottoSale{" +
                "minquantity=" + minquantity +
                ", discount=" + discount +
                '}';
    }
}
