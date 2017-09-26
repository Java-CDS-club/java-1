package com.add;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;
//public class TestAdder{
public class TestAdder{
	@Test
	public void test(){
		
		Adder add=new Adder();
		add.sum(10,20);
		add.sum("10","20");
		add.sum("ten","twenty");

	}

}