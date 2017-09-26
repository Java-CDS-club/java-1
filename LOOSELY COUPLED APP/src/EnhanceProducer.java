
public class EnhanceProducer implements IProducer {

	@Override
	public void withdraw() {
		System.out.println("This is faster withdraw");
		System.out.println(checkPinCode());
		checkNewTransaction();
	}
public String checkPinCode(){
	return "check pin new version";
	

}
public void checkNewTransaction(){
	System.out.println("New version of Transaction");
}
}
