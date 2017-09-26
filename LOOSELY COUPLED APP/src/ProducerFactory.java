import java.util.ResourceBundle;


public class ProducerFactory {
public static IProducer getObject() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
	/*IProducer producer=new Producer();
	return producer;*/ // this is also not good practice
	ResourceBundle rb=ResourceBundle.getBundle("object");
	String className=rb.getString("classname");
   Object object=Class.forName(className).newInstance();
return (IProducer)object;
}
}
