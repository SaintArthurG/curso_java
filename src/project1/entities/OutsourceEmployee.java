package project1.entities;

public class OutsourceEmployee extends Employee {
    protected Double additionalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerour, Double additionalCharge) {
        super(name, hours, valuePerour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - R$" + String.format("%.2f", payment()));
        return sb.toString();
    }
}
