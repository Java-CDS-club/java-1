package com.inner;

public class TestOuter {

	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner1=outer.new Inner();
		//Outer.Inner inner2=new Outer().new Inner();
		outer.print();
		//outer.show();
		//inner1.print();
		inner1.show();
		
	}

}
