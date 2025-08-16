package javacore.introducao;

public non-sealed class Salesman extends Employeer {

    private double percentPerSold;

    public Salesman(String code, String name, String address, int age, int salary, double percentPerSold) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
    }

    public Salesman() {

    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
