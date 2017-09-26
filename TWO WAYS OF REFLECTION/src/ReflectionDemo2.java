
import java.lang.reflect.Method;
import java.util.Scanner;
class Test{
	int a,b;
	static int c;
	private int d;
	protected int e;
	private Test(){
		System.out.println("Test class private default constructor");
	}
void disp(){
	System.out.println("display in class Test");
}
}
class A{
	A(){
		System.out.println("A constructor call");
	}

	void print(){
	System.out.println("print in class A");
}
}
public class ReflectionDemo2{
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws Exception {
		// for reflection
		// 1 st way
		Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter the class name to load");
		//String className=scanner.next();
		//Object obj1=Class.forName("A").newInstance();
		A obj1=new A();
		Class cls1=obj1.getClass();
		System.out.println(cls1);
	    System.out.println("*****************************************"); 
		System.out.println("Enter the method name to invoke");
		 String methodName=scanner.next();
		Method method1=obj1.getClass().getDeclaredMethod(methodName);
		method1.invoke(obj1);
	scanner.close();
	System.out.println("*************************************************");
	System.out.println("**********************************************8***");
	System.out.println("***************************************************");
	//2 nd way of reflection
	A obj2=new A();
	Class cls2=A.class;
	System.out.println("****************************");
	System.out.println(cls2);
	System.out.println("***********************************");
	Method method2=obj2.getClass().getDeclaredMethod(methodName);
	method2.invoke(obj2);
	// to access the class whose default constructor is private
	//Test obj3=new Test(); //we can mot use this technique
	//Object obj3=(Test)Class.forName("Test").newInstance();
	Class cls4=Test.class;
	System.out.println(cls4);
	
	Class cls3=Test.class;
	System.out.println("The total number of fields in class test are "+cls3.getDeclaredFields().length);
	Class cls5=java.lang.System.class;
	System.out.println(cls5);
	
	}

}
