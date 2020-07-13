package java8;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Streams {
	public static List<String> check(List<String> list)
	{
		 Predicate<String> startWith  = (Value)->Value.startsWith("a"); 
	     Predicate<String> length = (Value)->Value.length()==3;
	     List<String> result = list.stream().filter(startWith.and(length)).collect(Collectors.toList());
	        return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		List<String> list = new ArrayList<String>();
		String element;
        for(int i=0;i<size;i++)
        {
        	System.out.println("enter element "+(i+1));
        	element = sc.next();
        	list.add(element);
        }
        
       List<String> stringList = check(list);
        if(stringList.size()>=1)
        {
        System.out.println("Strings starts with a and length is 3 are "+stringList);
        }
        
        else {
        	System.out.println("element not Found on given condition");
        }
     
        sc.close();
		
	}

}