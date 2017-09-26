package com.SBI.caller;

import java.util.Scanner;
@SuppressWarnings("resource")
public class Caller {

	
	
      static{
		
		Password pass=new Password();
		System.out.println("Create your password");
		Scanner scanner=new Scanner(System.in);
		String password=scanner.nextLine();
		pass.setPassword(password);
	}
	
}


