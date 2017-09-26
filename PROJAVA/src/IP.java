import java.io.DataInputStream;
import java.io.IOException;


public class IP {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int a,b,c;
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the two numbers for the addition");
a=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
c=a+b;
System.out.println("the addition is\t"+c);
	}

}
