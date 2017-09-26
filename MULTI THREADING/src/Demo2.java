class Logic implements Runnable{

	@Override
	public  void run() {
		System.out.println("Account info starts...");
		System.out.println("Following are the Account info..");
		System.out.println("Info for  "+Thread.currentThread().getName());
		System.out.println("Processing Account Withdraw Process..for "+Thread.currentThread().getName());
		System.out.println("Withdraw Process Ends...");
		
	}
	
}
public class Demo2 {
public static void main(String[] args) {
	Logic logic=new Logic();
Thread worker1=new Thread(logic,"ram");
Thread worker2=new Thread(logic,"shyam");
Thread worker3=new Thread(logic,"mike");
worker1.start();
worker2.start();
worker3.start();

}
}