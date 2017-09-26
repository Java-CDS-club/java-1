package com.SBI.caller;

import java.util.Scanner;

import com.SBI.factory.Factory;
import com.SBI.server.Account;
import com.SBI.server.SavingsAccount;

public class Menu {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Caller caller=new Caller();
		String pwd;
		int choice;
		Scanner scanner=new Scanner(System.in);
	
		while(true){
		System.out.println("Enter 1 for deposit withdrawal 2 to exit");
		choice=scanner.nextInt();
		switch(choice){
		
		case 1:
		System.out.println("Enter your password");
		pwd=scanner.next();//doubt
		
		Account account=Factory.getObject();
	
	
			System.out.println("Amount Deposited "+account.deposit(2000, "xxx",pwd));
		System.out.println("Amount Withdrawn "+account.withdraw(1000, "xxx", pwd));
		if(SavingsAccount.ctr>3)
			System.out.println("Sorry your SavingsAccount Withdrawal Transaction Limit Exceeded");
		break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Invalid choice");
		}
	}

}
}