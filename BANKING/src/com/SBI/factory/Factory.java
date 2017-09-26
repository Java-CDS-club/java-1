package com.SBI.factory;

import java.util.ResourceBundle;

import com.SBI.server.Account;

public class Factory {
public static Account getObject(){
	ResourceBundle rb=ResourceBundle.getBundle("object");
String className=rb.getString("classname");
Account account=null;
try {
	account=(Account)Class.forName(className).newInstance();
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return account;


}
}
