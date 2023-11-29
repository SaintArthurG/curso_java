package project3.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " R$" + String.format("%.2f", totalPrice()) + "(Customs fee: R$" + String.format("%.2f)", customsFee));
        return sb.toString();
    }

    public Double totalPrice(){
        return price + customsFee;
    }
}
