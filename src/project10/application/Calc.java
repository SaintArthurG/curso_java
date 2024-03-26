package project10.application;

public class Calc {
    private Double nmb1;
    private Double nmb2;
    public Calc (){

    }
    public Calc (Double nmb1, Double nmb2){
        this.nmb1 = nmb1;
        this.nmb2 = nmb2;
    }

    public Double getNmb1() {
        return nmb1;
    }

    public void setNmb1(Double nmb1) {
        this.nmb1 = nmb1;
    }

    public Double getNmb2() {
        return nmb2;
    }

    public void setNmb2(Double nmb2) {
        this.nmb2 = nmb2;
    }

    public Double Calcular(char op){
        double ax = switch (op) {
            case '+' -> nmb1 + nmb2;
            case '-' -> nmb1 - nmb2;
            case '*' -> nmb1 * nmb2;
            case '/' -> nmb1 / nmb2;
            default -> 0;
        };
        return ax;
    }
}
