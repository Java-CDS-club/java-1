package com.string.buffer.demo;

import java.util.Scanner;

public class StringBufferDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	StringBuffer sql=new StringBuffer(500);
	sql.append("select * from products ");
	double price;
    Scanner scanner=new Scanner(System.in);
	System.out.println("enter the price");
	price=scanner.nextDouble();
	if(price>0){
		sql.append("where price is > ").append(price);
		
	}
			
	System.out.println("The stored querry is \n  "+sql);//to print the stored querry
		


	}

}
