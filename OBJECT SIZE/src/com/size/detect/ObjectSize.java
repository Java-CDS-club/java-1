package com.size.detect;

class T{
	
}
public class ObjectSize {
public static void preMain(String[] args){
	System.out.println("premain call");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("main call");
		T obj=new  T();
	}

}
class T2{
	int w;
}
class T3{
	int w;
	String e="Hello";
			
}
class T4{
	long e;
	int i;
}