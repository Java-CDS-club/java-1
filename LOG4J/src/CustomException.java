

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

class MinorAgeException extends Exception{
	private int age;
	public MinorAgeException(int age) {
     this.age=age;
     //System.out.println(age);
	}
@Override
public String toString(){
	if(age>0)
	return "your Age "+age+" less than 18 and you can not apply for driving licence";
	else
		return "please enter a valid age \n enter age again";
}

}



public class CustomException {
static int age;
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(CustomException.class);
      logger.debug("inside main");
        Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the age");
	 try{
	  age=scanner.nextInt();
	 }
	 catch(InputMismatchException e){
	 //System.out.println("please enter a valid age");
		 logger.error(e);
	
	 }
	 catch(Exception e){
		System.out.println("some other problem raised in the system"); 
	logger.error(e);
	 
	 }
	 //scanner.close();
	 try{
		 if(age<18){
			 //logger.debug("inside main and "+ "MinorAgeException");
			 throw new MinorAgeException(age);
		 
		 }
	 System.out.println("Now you can apply for voter id as well as dirving liecence");
	 
	 System.out.println("now outside main");
	 }
	catch(MinorAgeException e){
		System.out.println(e);
	}
	catch(Exception e){
		System.out.println("some other problem raised in the system");
		logger.error(e);
	}
	//scanner.close();
	
	}

}
