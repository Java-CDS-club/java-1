
public class Consumer {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*Producer producer=new Producer();// this is tightly coupled
		producer.withdraw();
		producer.checkPin();
		producer.checkTransaction();
*/    /* IProducer producer=new EnhanceProducer(); // this is also tightly coupled
       producer.withdraw();*/
      /* producer.checkPin();//    we can not call them easily as they are not defined in the interface
       producer.checkTransaction();*/
	ProducerFactory.getObject().withdraw();
	}

}
