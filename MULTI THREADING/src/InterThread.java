class XQuantity{
	boolean isProduce=false;
	int quan;
  synchronized void put(int quan){
	if(isProduce){
		try {
			this.wait();
		} catch (InterruptedException e) {
			System.out.println("In put "+e);
			e.printStackTrace();
		}
	}
	this.quan=quan;
	System.out.println("Quantity put by producer "+this.quan);
	isProduce=true;
	this.notify();
  }
synchronized int get(){
	if(isProduce==false){
		try {
			this.wait();
		} catch (InterruptedException e) {
			System.out.println("In get "+e);
			e.printStackTrace();
		}
	}
System.out.println("Quantity got by consumer "+this.quan);
isProduce=false;
this.notify();
return this.quan;
}
}
class Producer1 implements Runnable{
XQuantity quan=null;
Producer1(XQuantity q){
	this.quan=q;
	Thread t=new Thread(this,"producer");
	t.start();
}
	@Override
	public void run() {
		int i=0;
		while(true){
			this.quan.put(i++);
		}
		
	}
	
}
class Consumer1 implements Runnable{
XQuantity quan=null;
public Consumer1(XQuantity q) {
	this.quan=q;
	Thread t=new Thread(this,"consumer");
	t.start();
}
	@Override
	public void run() {
		int i=0;
		while(true){
			this.quan.get();
		}
		
	}
	
}
public class InterThread {

	public static void main(String[] args) {
		XQuantity obj=new XQuantity();
		Producer1 producer=new Producer1(obj);
		Consumer1 consumer=new Consumer1(obj);
		

	}

}
