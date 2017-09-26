package serverClient;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
String serverIP="localhost";
int serverPort=9001;
Socket socket=new Socket(serverIP,serverPort);
InputStream is=socket.getInputStream();
int singleByte=is.read();
while(singleByte!=-1){
	System.out.println((char)singleByte);
}
	
	socket.close();
	}


}
