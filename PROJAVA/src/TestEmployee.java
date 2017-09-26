import java.util.ArrayList;


public class TestEmployee {

	public static void main(String[] args)throws Exception {
		Employee a=new Employee();
		Employee b = new Employee();
		b = a;
	Employee ram=new Employee();
		if(100>20){
			Employee shyam = new Employee();  // Automatic GC, Scope of Object
		}
		//Employee ram = new Employee(1001,"Ram",9090);
		ram.setSalary();
		System.out.println("Ram Salary "+ram.getSalary());
		ram.setPhone("2222");
		System.out.println("Ram Phone "+ram.getPhone());
		ram = null; // When no one is pointing the object

		//Employee e=new Employee();
	System.out.println("Code Start");
	while(true){
		Employee e=new Employee();
		ArrayList list=new ArrayList();
list.add(e);
	Thread.sleep(50);
	}
	
	
	}
}
