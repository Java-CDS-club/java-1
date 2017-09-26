


 class Transaction implements Runnable{

	@Override
	public void run() {
		System.out.println("Account info starts...\n info for  "+Thread.currentThread().getName());
		//System.out.println("Info for  "+Thread.currentThread().getName());
		synchronized (this) {
		System.out.println("Processing Account Withdraw Process..\n withdraw for "+Thread.currentThread().getName());
		System.out.println("Withdraw Process Ends...");
		
	}
	
	}
}
public class Demo3 {
public static void main(String[] args) {
	Transaction transaction=new Transaction();
Thread worker1=new Thread(transaction,"ram");
Thread worker2=new Thread(transaction,"shyam");
Thread worker3=new Thread(transaction,"mike");
worker1.start();
worker2.start();
worker3.start();

}

}
