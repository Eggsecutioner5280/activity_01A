//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

public class Account {
    private static String Chris;
    int aNum;
    String name;
    double balance = 0.0;

    public Account(int aNum, String name, double balance) {
        this.aNum = aNum;
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (this.balance < 0.0) {
            this.balance = 0.0;
        }

        return this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance < 0.0) {
            this.balance = 0.0;
        }

        return this.balance -= amount;
    }

    public int getaNum() {
        return this.aNum;
    }

    public void setaNum(int aNum) {
        this.aNum = aNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Account{Your account balance is: " + this.balance + "}";
    }

    public static void main(String[] args) {
        new Date();
        Account account1 = new Account(2211, Chris, 22.0);
        account1.deposit(22.5);
        account1.withdraw(44.0);
        System.out.println(account1);
    }
}
