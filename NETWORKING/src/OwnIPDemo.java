import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class OwnIPDemo {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress inet=InetAddress.getLocalHost();
		/*System.out.println("Local Host Address is "+inet.getHostAddress());  // static way of getting addresss
	System.out.println("Local Host Name is "+inet.getHostName());
	System.out.println("Inet Address "+InetAddress.getLocalHost());
	System.out.println("Loop Back Address is "+InetAddress.getLoopbackAddress());*/
	 
		// dynamic way of getting addresss
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Host Name");
	String hostName=scanner.next();
	InetAddress[] address=InetAddress.getAllByName(hostName);
	for(InetAddress add:address){
		System.out.println("Host Name is "+add);
	}
	
	}

}
