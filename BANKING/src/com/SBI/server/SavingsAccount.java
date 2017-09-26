package com.SBI.server;

import com.SBI.caller.Password;

public class SavingsAccount implements Account {
	public static int ctr=0;//counter variable for SavingsAccount transactions
	public boolean checkLimit(){
		ctr++;
		if(ctr<=3){
			
		
			return true;
		}
			else
			return false;
	}
	@Override
	public double withdraw(double amount, String pincode, String password) {
	Password pass=Password.returnObject();
		if(pass.getPassword().equals(password)){
			
		if(checkLimit()){
			
			System.out.println("withdrawn from savings account");
		return amount;
		}
		else {
			System.out.println("withdrawn from savings account");
		
			return 0;
		}
		}
		else{
			System.out.println("withdrawn from savings account");
			return 0;
		}
	}

	@Override
	public double deposit(double amount, String pincode, String password) {
		Password pass=Password.returnObject();
		if(pass.getPassword().equals(password)){
			System.out.println("Deposited in savings account");
		return amount;
	}
		else {
			System.out.println("Deposited in savings account");
			return 0;
		}
}
}
