package com.inner;

public class Outer  {
int a;
private int b;
	public Outer() {
System.out.println("I am outer class constructor");
a=100;
b=2000;
	}
	void print(){
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
	}
	
	class Inner {
		int d;
		private int c;
		Inner(){
		System.out.println("I am inner class constructor");
	c=3000;
	d=300;
		}
		void show(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}
}
