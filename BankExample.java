class Bank {
    double amount;
    Bank(double amount) { this.amount = amount; }

    void withdraw(double w) {
        System.out.println((w <= amount) ? "Withdrawal successful" : "Insufficient balance");
        if (w <= amount) amount -= w;
    }

    void deposit(double d) { amount += d; }

    void print() { System.out.println(amount); }
}

public class BankExample {
    public static void main(String[] args) {
        Bank b = new Bank(10000);
        b.withdraw(12000);
        b.deposit(5000);
        b.print();
    }
}
