package javacore.introducao.dominio.Treino;

public non-sealed class Salesman extends Employeer {

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code, String name, String address, int age, int salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {

    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold) / 100;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
