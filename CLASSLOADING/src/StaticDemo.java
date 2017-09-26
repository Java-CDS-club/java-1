class A{
public A() {
	System.out.println("default constructor of A");
}
	

	static{
	System.out.println("static block of A");
}
	{
		System.out.println("instance block of A");
	}
}
class B{
 B(){
	 System.out.println("defaut constructor of B");
 }
	static{
		System.out.println("static block of B");
	
	}
	{
		System.out.println("instance block of B");
	}
void print(){
	System.out.println("print in B");
}
}
public class StaticDemo {
public StaticDemo() {
System.out.println("default constructor of StaticDEmo");
}
static{
	System.out.println("ststic bloc of static Demo");
	
	{
		System.out.println("instance bolock of StaticDEmo");
		
	}
}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
System.out.println("main execution");
	Class.forName("A");
	Class.forName("B");
	A a=new A();
	B b=(B)Class.forName("B").newInstance();
	b.print();
	}

}
