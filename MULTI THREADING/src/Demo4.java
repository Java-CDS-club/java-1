class Transit{
	public void someOtherLogic(){
		System.out.println("Account info starts...\n info for  "+Thread.currentThread().getName());	
	}
	public void myLogic(){
		System.out.println("Processing Account Withdraw Process..\n withdraw for "+Thread.currentThread().getName());
		System.out.println("Withdraw Process Ends...");
	}
}
class Job100 implements Runnable{
	Transit transit=new Transit();
	@Override
	public void run() {
		transit.someOtherLogic();
		//System.out.println("Info for  "+Thread.currentThread().getName());
		synchronized (transit) {
		transit.myLogic();
		
	}
	
	}
}
public class Demo4 {
public static void main(String[] args) {
	Job100 job=new Job100();
Thread worker1=new Thread(job,"ram");
Thread worker2=new Thread(job,"shyam");
Thread worker3=new Thread(job,"mike");
worker1.start();
worker2.start();
worker3.start();

}

}