package com.selfProject.BankinngApplication;
import java.util.Scanner;
public class bankingApplication {
	
	public static void main(String[] args) {
    BankAccount ob= new BankAccount("Shreya Ghosh","BA00023");
    ob.showMenu();
	}

}
class BankAccount
{
	double balance;
	double previousTransaction;
	String costumerId;
	String costumerName;
	BankAccount(String cid, String cn)
	{
		costumerId = cid;
		costumerName = cn;
	}
	void deposit(double amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previousTransaction= amount;
		}
	}
	void withdraw(double amount)
	{
		if(amount!=0)
		{
			balance= balance-amount;
			previousTransaction= -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited Amount:"+ previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn Amount:" + Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	void showMenu()
	{
		char options= '\0';
		Scanner in =new Scanner(System.in);
		System.out.println("Welcome" + costumerName);
		System.out.println("Your ID is" + costumerId);
		System.out.println("A. Check my balance");
		System.out.println("B. Checkmy deposits");
		System.out.println("C. Check my withdrawls");
		System.out.println("D. Show my previous transactions");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("--------------------------------------------------------------");
			System.out.println("Enter any option");
			System.out.println("--------------------------------------------------------------");
			options= in.next().charAt(0);
			System.out.println("\n");
			
			switch(options)
			{
			case 'A':
				System.out.println("--------------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("--------------------------------------------------------------");
				break;
				
			case 'B':
				System.out.println("--------------------------------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("-------------------------------------------------------------");
				int amount= in.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("--------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("--------------------------------------------------------------");
				int amount2= in.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("");
				getPreviousTransaction();
				System.out.println("");
				break;
				
			case 'E':
				System.out.println("--------------------------------------------------------------");
				break;
				
			default:
				System.out.println("Invalid option! Please enter again.");
				break;
			}
			
		}
		while(options!='E');
		System.out.println("Thank You For Your Service");
	}
}
