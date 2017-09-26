package com.counting.modifiers;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


class P1{
	int x,y;
	private int z;
	static int w;
	P1(){
		System.out.println("p1 constructor and I will be caled when the object of class p1 will be created");
		
	}
static{
	System.out.println("staic block of class p1 and I will be called when class P1 will be loaded");
	
}

}
public class ModifiersCount {

	public static void main(String[] args) {
		P1 obj=new P1();// It will give data info
		Class cls=obj.getClass(); // It will give meta Data info +Data info
		System.out.println(cls.getDeclaredFields().length);// It will print number of declared variables in the class
		System.out.println("**************************************************************");
		System.out.println("***************************************************************");
        System.out.println("No of fields are "+cls.getDeclaredFields().length);
        int privateCount = 0;
        int staticCount=0;
       
        int otherVariableCount=0;
        for(Field f:cls.getDeclaredFields()){
        	if(Modifier.isPrivate(f.getModifiers())){
        		privateCount++;
        		
        	}
        	else
        		if(Modifier.isStatic(f.getModifiers())){
        		staticCount++;
        	
        		}
        		else{
        			otherVariableCount++;
        		}
        		
        			
        }
       System.out.println("private variables are "+privateCount);
       System.out.println("Static variables are "+staticCount);
       System.out.println("Other variables are "+otherVariableCount);
	}

}
