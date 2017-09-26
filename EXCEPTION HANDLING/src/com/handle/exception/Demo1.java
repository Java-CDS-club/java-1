package com.handle.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int firstno=0;
		Scanner scanner=new Scanner(System.in);
      int secondno=0;
     try{
      System.out.println("Enter the first no");
      firstno=scanner.nextInt();
      System.out.println("Enter the second no");
      secondno=scanner.nextInt();
      double result=(double)firstno/secondno;
      System.out.println("The  division result is "+result);
	}catch(InputMismatchException e){
		System.out.println("please input only integer form");
	System.out.println("please re enter the number");
		main(args);
	}
    catch(Exception e){
    	System.out.println("some other problem");
    }
}

}
