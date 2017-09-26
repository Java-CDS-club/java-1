package com.SBI.server;

import com.SBI.caller.Password;

public class CurrentAccount implements Account {

	Password pass=Password.returnObject();
	
	@Override
	public double withdraw(double amount, String pincode, String password) {
		
	if(pass.getPassword().equals(password)){	
		System.out.println("withdrawn from current account");
		return amount;
	}
	else{
		System.out.println("withdrawn from current account");
		return 0;
	}
	
	}

	@Override
	public double deposit(double amount, String pincode, String password) {
		if(pass.getPassword().equals(password)){	
			System.out.println("Deposited in current account");
			return amount;
		}
		else{
			System.out.println("Deposited in current account");
			return 0;
		}
	}
	}


