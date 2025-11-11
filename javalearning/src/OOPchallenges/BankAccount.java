package OOPchallenges;

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your deposit :");
        double deposit = input.nextDouble();
        this.balance += deposit;
        return this.balance;
    }
    public double withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your withdraw :");
        double withdraw = input.nextDouble();
        this.balance -= withdraw;
        return this.balance;
    }
    public void displayBalance(){
        System.out.println("Account number"+accountNumber+",Balance:"+balance);
    }

    public static void  main(String[] args){
        BankAccount account1 = new BankAccount(1,1500);
        account1.displayBalance();
        account1.deposit();
        account1.withdraw();
        account1.displayBalance();
    }
}
