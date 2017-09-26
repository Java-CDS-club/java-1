import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
// we will add file handling to our program in order to save the web page for the future use

public class WebsiteIPAddress {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file name to be created ");
		String name=scanner.next();
		System.out.println("Enter the web page name");
		String webPage=scanner.next();
		String path="D:\\DUCAT\\NETWORKING\\DownloadedWebPages\\"+name+".html";
		FileOutputStream fo=new FileOutputStream(path);
		URL url=new URL(webPage);
		URLConnection urlconnection=url.openConnection();
		urlconnection.connect();
		InputStream is=urlconnection.getInputStream();
		int singleByte=is.read();
		int EOF=-1;
		while(singleByte!=EOF){
        fo.write((char)singleByte);
			System.out.print((char)singleByte);
           singleByte=is.read();
	}
System.out.println("Web page Downloaded....");
scanner.close();
fo.close();
is.close();
	}

}