package javacore.introducao.dominio.ZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public void withDrawl(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
