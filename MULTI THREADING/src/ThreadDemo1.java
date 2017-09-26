class Job implements Runnable{

	@Override
	public void run() {
	for(int i=1;i<=5;i++){
	System.out.println("I is "+i+" and Thread is "+Thread.currentThread().getName());	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
		
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
	Job job1=new Job();
	Job job2=new Job();
	Job job3=new Job();
	Thread worker1=new Thread(job1,"Ram");
	Thread worker2=new Thread(job2,"Shyam");
	Thread worker3=new Thread(job3,"Mike");
	worker1.start();
	worker1.join();
	worker2.start();
	worker3.start();
	for(int i=1;i<=5;i++){
		System.out.println("Main :: I is "+i+" and Thread is main");
	}
	}

}
