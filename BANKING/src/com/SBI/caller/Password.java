package com.SBI.caller;

public class Password {
private static String password;

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	Password.password = password;
}
public static Password returnObject(){
	Password pass=new Password();
	return pass;

}

}
