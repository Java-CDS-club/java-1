import java.util.Scanner;

public class FirstCapital {

	public static void main(String[] args) {
		String s,s2="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sentence");
		s=scanner.nextLine();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isSpaceChar(c)||i==s.length()-1){
				s2=s2+c;
				System.out.print(Character.toUpperCase(s2.charAt(0))+s2.substring(1));
				s2="";
			}
			else{
				s2=s2+c;
			}
		
		}
         scanner.close();
	}

}
