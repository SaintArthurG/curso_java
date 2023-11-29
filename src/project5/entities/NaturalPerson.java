package project5.entities;

public class NaturalPerson extends Person {
    private double heathSpents;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double annualIncome, double heathSpents) {
        super(name, annualIncome);
        this.heathSpents = heathSpents;
    }

    public double getHeathSpents() {
        return heathSpents;
    }

    public void setHeathSpents(double heathSpents) {
        this.heathSpents = heathSpents;
    }

    public double taxesHeath() {
        if (heathSpents > 0) {
            return heathSpents * 0.5;
        } else {
            return 0.0;
        }
    }

    @Override
    public double taxes() {
        double taxess = 0.0;
        if (annualIncome > 20000.00) {
            taxess = annualIncome + annualIncome * 0.25;
            taxesHeath();
        } else {
            taxess = annualIncome + annualIncome * 0.15;
            taxesHeath();
        }
        return taxess;
    }

}
