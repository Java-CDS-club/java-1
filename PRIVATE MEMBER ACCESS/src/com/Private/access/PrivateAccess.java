package com.Private.access;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class T{
	int x,y;
	@SuppressWarnings("unused")
	private int k;
	@SuppressWarnings("unused")
	private void callMe(){
		System.out.println("I am private method and I can not be called easily outside the class");
	}
}
public class PrivateAccess {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		T obj=new T();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the field name to access");
		String fieldName=scanner.next();
		Field field=obj.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		System.out.println("Field value is "+field.get(obj));
	System.out.println("Enter the method name to invoke");
	String methodName=scanner.next();
	Method method=obj.getClass().getDeclaredMethod(methodName);
	method.setAccessible(true);
	method.invoke(obj);
	scanner.close();
	}

}
