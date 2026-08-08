package Abstraction;

//Here, "Abstraction.Account" is a polymorphism and abstractive class
abstract class Account{
    String name;
    double balance;

    Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void diposit(double amount){
        balance+=amount;
    }

    abstract void withdraw(double amount);
    abstract double yearlyCharge();
    abstract double loan();
}

class SavingAccount extends Account{

    SavingAccount(String name, double balance){
        super(name, balance);
    }

    void withdraw(double amount){
        if(balance - amount > balance * .02)
            balance -= amount;
    }

    double yearlyCharge(){
        return balance*.05;
    }

    double loan(){
        return balance*.5;
    }
}

class CurrentAccount extends Account{

    CurrentAccount(String name, double balance){
        super(name, balance);
    }

    void withdraw(double amount){
        if(balance - amount > balance * .05)
            balance -= amount;
    }

    double yearlyCharge(){
        return balance*.1;
    }

    double loan(){
        return balance*.7;
    }
}


public class AbstractionExample3 {
    public static void main(String[] args) {
        Account s1 = new SavingAccount("Anik", 2000);
        System.out.println(s1.name + " : " + s1.balance); //balance: 2000
        s1.diposit(1000);
        System.out.println(s1.name + " : " + s1.balance); //balance: 3000
        s1.withdraw(500);
        System.out.println(s1.name + " : " + s1.balance); //balance: 2500
        System.out.println("Yearly charge of the " + s1.name + "'s account is " + s1.yearlyCharge());
        System.out.println("Loan given to the " + s1.name + "'s account is " + s1.loan());

        Account s2 = new CurrentAccount("Lokkhi", 10_000);
        System.out.println(s2.name + " : " + s2.balance); //balance: 10,000
        s2.diposit(5_000);
        System.out.println(s2.name + " : " + s2.balance); //balance: 15,000
        s2.withdraw(10_000);
        System.out.println(s2.name + " : " + s2.balance); //balance: 5,000
        System.out.println("Yearly charge of the " + s2.name + "'s account is " + s2.yearlyCharge());
        System.out.println("Loan given to the " + s2.name + "'s account is " + s2.loan());
    }
}
