package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
public class Demo2 {

	public static void print(int x){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(10);// It adds as Object generally from the starting index of the array
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0,1000);             
		list.add("Ram");
		System.out.println(list);
		int temp=(int) list.get(2); 
	System.out.println(temp);
	String str=(String) list.get(5);
	System.out.println(str);
	Object obj1=list.get(2);
	Object obj2=list.get(5);
	System.out.println(obj1);
	System.out.println(obj2);
	
	This is a very bad way of coding
	
	*/
	
		//ArrayList<Integer> list=new ArrayList<Integer>();    from java 5
		
		// now this is generic ArrayList
		
		ArrayList<Integer> list=new ArrayList<>();   //  From java 7
		
		list.add(10);// It adds as Object generally from the starting index of the array
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0,1000);             
		//list.add("Ram");
		
		System.out.println(list);
		int temp=list.get(2); 
	System.out.println(temp);
	list.remove(0);
	System.out.println(list);
	int index1=list.indexOf(20);
	int index2=list.indexOf(2000);
	System.out.println("Index is "+index1);
	System.out.println("Index is "+index2);
	System.out.println(list.contains(20));
	System.out.println(list.contains(20000));
	if(index1>=0){
		System.out.println("Found...");
		list.set(index1,9999);
	}
	else{
		System.out.println("Not Found...");
	}
	int temp2=list.get(1);
	System.out.println(list);
	// sorting
	/*collections -> It is a class and it is a utility class
	The use of thsi class is that it is used to sort the list,copy the list,reverse the list, su8blist */
	Collections.sort(list);
	System.out.println("After sort "+list);
	// Traverse the ArrayList
	// 1 st way (Traditional way)
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// 2 nd way
	// Traverse+remove+unidirectional
	
	Iterator<Integer> i=list.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
		// i.remove();  // removes the current element
		
		// give the current element and move to the next element
	}
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// 3 rd way 
// traverse+remove+bidirectional
	ListIterator<Integer> li=list.listIterator();
	while(li.hasNext()){
		System.out.println(li.next());
		// li.remove()  // Remove the current element
		// give the current element and move to the next element
	}
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// 4 th way enhance for loop
	for(int j:list){
		System.out.println(j);
	}
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// 5 th way from java 8
	// forEach is not a loop, it is a function
	
	list.forEach(Demo2::print);
	// functional programming 
	// java 8 2013
	
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	
	// Another way
	list.forEach((x)->{
		if(x%2==0){
			System.out.println("Even "+x);
		}
		else{
			System.out.println("Odd "+x);
		}
	});
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// 6 th way streams
	long count=list.stream().filter((x)->x%2==0).mapToInt((x)->x).count();
	System.out.println("The count is "+count);
	System.out.println("*********************************************");
	System.out.println("**********************************************");
	// For summing
	long sum=list.stream().filter((x)->x%2==0).mapToInt((x)->x).sum();
	System.out.println("The sum is "+sum);
	}

}
