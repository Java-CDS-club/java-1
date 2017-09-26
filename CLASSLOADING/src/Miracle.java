class HH{
	
	static HH hh1=new HH();
	static{
		System.out.println("static block of HH");
	
	}
	{
		System.out.println("init block of HH");
		
	}
}
public class Miracle {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HH hh2=new HH();

	}

}
