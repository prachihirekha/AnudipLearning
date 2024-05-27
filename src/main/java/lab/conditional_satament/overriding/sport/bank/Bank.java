package src.main.java.lab.conditional_satament.overriding.sport.bank;
//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). 
//Create two subclasses SavingsAccount and CheckingAccount.
//Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
public class Bank {
 protected double balance;
  public Bank(double initalBalance) {
	  this.balance=initalBalance;
  }
   void deposit(double amount) {
	   if(amount>0) {
		 balance +=amount;
		 System.out.println("deposit"+ amount+" balance"+ balance);
	   }else {
		   System.out.println("deposite must be positive");
	   }
   }
    void withDraw(double amount) {
    	
    	if(amount>0 && amount<= balance) {
    		balance -=amount;
    		System.out.println("withdrew"+ amount+" new balance"+ balance);
    	}
    	else {
    		System.out.println("withdrawal amount must be positive and within the available balance");
    	}
    }
    public double getBalance() {
    	return balance;
    }
}
