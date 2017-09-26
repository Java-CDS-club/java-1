package com.emp;

class ExeEmployee {

	public static void main(String[] args) {
				Employee em=new Employee(11,5000);
em.setAddress("acvffhhh");
em.setBonous(3.454);
em.setDeptname("jghgguygty");
em.setEmail("jjhuyuyuyujyu");
em.setManagername("jyuuytutyutyt");
em.setName("yyuyu");
em.setPhone("5576767");
em.setSalary();

em.print();
//em.name="ramesh"
//em.salary=3000;
System.out.println("\n\n*******************************************************************\n\n");
em.getHra();
em.getTa();
em.getDa();
em.getGrossSalary();
System.out.println("\n\n*******************************************************************\n\n");
System.out.println("The basic salary of the employee is\t"+em.getSalary());
System.out.println("the bonous of the employee is\t"+em.getBonous());
	}

}
