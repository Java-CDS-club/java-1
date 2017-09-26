class Account{
	void withDraw()
	{
		System.out.println("DRawn from account");
	
	}
void deposit(){
	System.out.println("deposited in account");
}
void roi(){
	System.out.println("roi in account");
}
}
class SavingsAccount extends Account{
	@Override
	void roi(){
	//super.roi();
	System.out.println("savings account roi");

	
	}
}
public class Poly {
@SuppressWarnings("unused")
public static void main(String[] args)throws Exception {
	SavingsAccount sa=new SavingsAccount();
	sa.deposit();
	sa.withDraw();
	sa.roi();
	Account aa=new Account();
	//aa.roi();
	Account ac=(Account)sa;
	ac.roi();
/*try{
	

	SavingsAccount saa=(SavingsAccount)aa;
saa.roi();
}catch(Exception e){
}*/
}
}