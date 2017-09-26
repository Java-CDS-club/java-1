package com.add;
//import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
//@Test
public class Adder {
int c=0;	
@Test
public  void sum(int a,int b ){
 c=a+b;
 Assert.assertEquals(c, 30);
}
@Test
public  void sum(String a,String b){
try{	
	c=Integer.parseInt(a)+Integer.parseInt(b);
	Assert.assertEquals(c, 30);
}catch(Exception e){
	c=0;
	Assert.assertEquals(c, 0);
}
}
}