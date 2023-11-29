package project1.entities;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerour) {
        this.name = name;
        this.hours = hours;
        this.valuePerour = valuePerour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerour() {
        return valuePerour;
    }
    public Double payment(){
        return valuePerour * hours;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " - R$ " + payment());
        return sb.toString();
    }

}
