package com.SBI.server;

public interface Account {
	double withdraw(double amount,String pincode,String password);
double deposit(double amount,String pincode,String password);
}
