package objectmodeling;

import java.util.ArrayList;
import java.util.List;

// Customer class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccNumber() + " Balance: " + acc.getBalance());
        }
    }
}

// Account class
class Account {
    private String accNumber;
    private double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
}

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened in " + bankName + " for " + customer);
    }
}

// Driver
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Rahul");
        Account a1 = new Account("ACC1001", 5000);
        bank.openAccount(c1, a1);

        Customer c2 = new Customer("Priya");
        Account a2 = new Account("ACC1002", 12000);
        bank.openAccount(c2, a2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
