import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
public int[] ReverseArray(int[] arr,int length){
	String str=Arrays.toString(arr);
	StringBuilder s=new StringBuilder();
	s.append(str);
	s.reverse();
	int[] arr1 = Arrays.stream(s.substring(1, s.length()-1).split(","))
		    .map(String::trim).mapToInt(Integer::parseInt).toArray();
	return arr1;
	
}
	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner scanner=new Scanner(System.in);
		int l=scanner.nextInt();
		int[] list=new int[l];
		
		
	}

}
