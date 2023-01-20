/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 01 - Account
 * Work Completed By Christopher Hammer
 */

import java.util.Date;

public class Account {

    int aNum;
    String name;
    double balance;

    public Account(int aNum, String name) {
        this.aNum = aNum;        // Initialize account number of constructor set by global variable.
        this.name = name;        // Initialize name of account of constructor and set it by the global variable.
        balance = 0.0;           // Initialize balance to zero. on account constructor.
    }

    public boolean deposit(double amount) {     //   Deposit can be used under these conditions:
        if (amount > 0.0) {                    // Logic:  To make a deposit, amount must be greater
            balance += amount;                 // then 0.  If balance is greater, then add amount
            return true;                       // to the balance and return true.  else return false.
        }
        return false;
    }


    public boolean withdraw(double amount) {     //  Withdraw can be used under these conditions:
        if(balance - amount >= 0){              // Logic: If the balance - amount is less than zero.
            balance -= amount;                  // then subtract amount from balance. then return true.
            return true;                        // otherwise return false.
        }
        return false;
    }

    @Override
    public String toString() {                                              // Override for output.
        return "Account{Your account balance is: $" + balance + "}";
    }
}

