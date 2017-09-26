package com.emp;

public class Employee {
private int empno;
private String name;
private int salary;
private double bonous;
private String address;
private String phone;
private String email;
private String deptname;
private String managername;
private String companyname;
private double hra;
private double da;
private double ta;
public Employee(){
	companyname="MICROSOFT";
}
public Employee(int empno,int salary ){
	this();
if(empno>=0)
	this.empno=empno;
else
{
	System.out.println("invalid Employee number");
	return;
}
/*int a=(int)name.charAt(0);
if((a>=65&&a<=90)||(a>=97&&a<=122))
	this.name=name;
else{
	System.out.println("invalid name");
return;
}*/
if(salary>=0)
	this.salary=salary;
else{
	System.out.println("invalid salary");
	return;
}
	/*if(bonous>=0.0)
		this.bonous=salary*bonous/100;
	else{
		System.out.println("invalid bonous");
		return;
	}*/
/*if(phone>=0)
	this.phone=phone;
else{
	System.out.println("invalid phone");
return;
}
	this.email=email;
int b=(int)deptname.charAt(0);
if((b>=65&&b<=90)||(b>=97&&b<=122))
	this.deptname=deptname;
else{
	System.out.println("invalid deptname");
return;
}
int c=(int)managername.charAt(0);
if((c>=65&&c<=90)||(c>=97&&c<=122))
	this.managername=managername;
else{
	System.out.println("invalid managername");
return;
}
this.address=address;*/
} 
public void setSalary() {
	this.salary = new Employee(11,2000).getSalary()+2000;
}
public int getEmpno() {
	return empno;
}
public int getSalary() {
	return this.salary;
}
public String getCompanyname() {
	return companyname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	//System.out.println("enter name");
	this.name = name;
}
public double getBonous() {
	return bonous;
}
public void setBonous(double bonous) {
	//System.out.println("enter bonous");
	//bonous=Double.parseDouble(args[1]);
	this.bonous = bonous;
}
public String getAddress() {

	return address;
}
public void setAddress(String address) {
	//System.out.println("enter address");
	//address=address[2];
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	//System.out.println("enter phone number");
	//phone=args[3];
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	//System.out.println("enter email");
	//email=args[4];
	this.email = email;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	//System.out.println("enter department name");
	//deptname=args[5];
	this.deptname = deptname;
}
public String getManagername() {
	return managername;
}
public void setManagername(String managername) {
//System.out.println("enter manager name");
//managername=args[6];
	this.managername = managername;
}
public void print(){
	System.out.println("Employee number="+empno);
	System.out.println("Name="+name);
	//System.out.println("Basic Salary="+salary);
	//System.out.println("Bonous="+bonous);
	System.out.println("Addres="+address);
	System.out.println("Phone no="+phone);
	System.out.println("Email="+email);
	System.out.println("Department name="+deptname);
	System.out.println("Manager's name="+managername);
	System.out.println("Company name="+companyname);
}
public void getHra(){
	hra=30*salary/100;
	System.out.println("HRA is="+hra);
}
public void getTa(){
	ta=20*salary/100;
	System.out.println("TA is="+ta);
}
public void getDa(){
	 da=10*salary/100;
	System.out.println("DA is="+da);
}
public void getGrossSalary(){
	System.out.println("THE GROSS SALARY OF THE EMPLOYEE IS\t"+(hra+ta+da+salary));
}
}
