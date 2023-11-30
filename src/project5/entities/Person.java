package project5.entities;

import java.util.List;

public abstract class Person {
    private String name;
    protected Double annualIncome;

    public Person() {
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double taxes();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ").append("R$").append(String.format("%.2f%n", taxes()));
        return sb.toString();
    }
}
