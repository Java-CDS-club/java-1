
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class A{
	A(){
		System.out.println("A constructor call");
		
	}
void print(){
	System.out.println("A print call");
	
}
}
class B {
B(){
	System.out.println("B constructor call");
}
void disp(){
	System.out.println("B display call");
}
}

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		// TODO Auto-generated method stub
//A obj=new A();// static code call
              //class resolved at compile time
              // eager way of calling

//dynamic code
System.out.println("Enter the class name");
Scanner scanner=new Scanner(System.in);
String className=scanner.next();
Object obj=Class.forName(className).newInstance();
System.out.println("Enter the method name");
String methodName=scanner.next();
Method method=obj.getClass().getDeclaredMethod(methodName);
method.invoke(obj);
//((A) obj).print();
scanner.close();
	}

}
