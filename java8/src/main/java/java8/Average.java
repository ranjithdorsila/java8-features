package java8;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		System.out.println("how many elements you want to enter to list to calculate average");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(); 
		int element;
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element "+(i+1));
			element = sc.nextInt();
			list.add(element);
		}
		OptionalDouble average = list.stream().mapToInt(x->x).average();
		System.out.println("Average of list of intergers are"+average);
		sc.close();	
	}
}