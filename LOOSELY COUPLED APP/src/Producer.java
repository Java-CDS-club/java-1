
public class Producer implements IProducer {
@Override
	public void withdraw(){
	System.out.println("This is withdraw call");
	System.out.println(checkPin());
	checkTransaction();
}
public String checkPin(){
	return "check pin....";
}
public void checkTransaction(){
	System.out.println("check Transaction");
}
}
