package java8;

import java.util.*;
import java.util.stream.IntStream;

public class Palindrome {
	
	static List<String> isPalindrome(List<String> l) {
		List<String> palindromeList = new ArrayList<String>();
		Iterator<String> iterator = l.iterator();
	      while(iterator.hasNext()) {
	    	 String word=iterator.next();
	    	 String temp  = word.replaceAll("\\s+", "").toLowerCase();
	 	    boolean result =  IntStream.range(0, temp.length() / 2)
	 	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	 	
	 	    	 if(result)
	 	    	  {
	 	    		palindromeList.add(word);
	 	    	  }
	      }
	    	return palindromeList;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("enter the size of array");
		
		
		int size = sc.nextInt();
		for(int i = 0; i<size; i++)
		{
			System.out.println("enter the string "+(i+1));
			String s=sc.next();
			list.add(s);
		}
		List<String> palindromeList = new ArrayList<String>();
		palindromeList =isPalindrome(list);
		Iterator<String> iterator = palindromeList.iterator();
	      while(iterator.hasNext()) {
	    	  System.out.println(iterator.next());    
	    	  
	      }
	      sc.close();
	}
}