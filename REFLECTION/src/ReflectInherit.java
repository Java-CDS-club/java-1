


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class C{
	C(){
		System.out.println("C constructor call");
		
	}
 void print(){
	System.out.println("C print call");
	
}
}
class D extends C {
D(){
	System.out.println("D constructor call");
	
}
void disp(){
	System.out.println("D display call");
}
}

public class ReflectInherit {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		// TODO Auto-generated method stub
//A obj=new A();// static code call
              //class resolved at compile time
              // eager way of calling

//dynamic code
System.out.println("Enter the class name");
Scanner scanner=new Scanner(System.in);
Object className=scanner.next();
Object obj=Class.forName((String) className).newInstance();
System.out.println("Enter the method name");
String methodName=scanner.next();
Method method=obj.getClass().getSuperclass().getDeclaredMethod(methodName);

method.invoke(obj);
//((C) obj).print();
method.invoke(obj);
scanner.close();
//System.out.println(obj.getClass());	
//System.out.println(obj.getClass().getDeclaredMethod(methodName));
	//System.out.println(D.class);
	//System.out.println(obj.getClass().getName());
	//System.out.println(java.lang.System.class);
System.out.println(obj.getClass().getSuperclass());
	}

}

