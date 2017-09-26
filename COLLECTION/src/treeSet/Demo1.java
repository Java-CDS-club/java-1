package treeSet;
import java.util.TreeSet;


public class Demo1 {

	public static void main(String[] args) {
		/* I want to create songs playlist
		 I want songs in sorted form
		 I want no dublicasy
		 I want I can add n number of songs
		 
		 Inter view question ??
				 Tell the accurate DataStructure???
*/
	
	TreeSet ts=new TreeSet();
	ts.add("Bang Bang");
	ts.add("Mr Lonely");
	ts.add("Boom Boom");
	ts.add("Ashiki 2");
	ts.add("Kingsmen");
	ts.add("Boom Boom");
	ts.add("Bang Bang");
	ts.add("123"); 
	
	System.out.println(ts);

	}

}
