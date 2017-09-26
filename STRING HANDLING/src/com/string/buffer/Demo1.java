package com.string.buffer;

class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Hello how are you");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb2=new StringBuffer();
		sb2.append("Hello this is StringBuffer Testing for long charecters");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println("********************************************************");
		/*StringBuilder cousin of StringBuffer but in StringBuilder methods are not synchronised while in StringBuffer 
        methods are synchronised*/
		System.out.println("******************************************************");
	     System.out.println(sb);  /*by using this we can get or print the value stored in the sb or sb2*/
          System.out.println(sb2);
	}

}
