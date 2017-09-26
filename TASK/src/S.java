
public class S {

	public static void main(String[] args) {
		String s="Space";
        System.out.println(s);		
		for(int i=1;i<=s.length();i++){
			System.out.println(s.substring(i)+s.substring(0, i));
		}

	}

}
