package project5.entities;

public class LegalPerson extends Person{
    private Integer employess;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer employess) {
        super(name, annualIncome);
        this.employess = employess;
    }

    public Integer getEmployess() {
        return employess;
    }

    public void setEmployess(Integer employess) {
        this.employess = employess;
    }

    @Override
    public double taxes() {
        if (employess > 10){
            return annualIncome * 0.14;
        } else {
            return annualIncome * 0.16;
        }
    }

}
