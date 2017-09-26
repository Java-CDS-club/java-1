package serverClient;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
final int PORT_NO=9001;
ServerSocket server=new ServerSocket(PORT_NO);
Socket socket=server.accept();
System.out.println("Enter the message for the Client");
Scanner scanner=new Scanner(System.in);
String message=scanner.nextLine();
OutputStream os=socket.getOutputStream();
os.write(message.getBytes());
os.close();
scanner.close();
server.close();


	}

}
