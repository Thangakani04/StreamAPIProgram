package StreamAPI_FilterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		
		
		  ArrayList<Integer> numberList = new ArrayList<Integer>();
  
		// Declaring collection
		  numberList.add(1);
		  numberList.add(2);
		  numberList.add(3);
		  numberList.add(4);
		  numberList.add(5);
		  numberList.add(6);
		  numberList.add(7);
		  numberList.add(8);
		 		
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> evenList =  new ArrayList<Integer>();
		
		//Without using stream concept
		
		  for(int n :numList) { 
			  if(n %2==0) { 
				  evenList.add(n); 
				  } 
			  }
		 
		
		//System.out.println(evenList);
		
		//By using streams concept -using filter()
		
		evenList =numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		//If we don't want to store the data in some other collection, if we want to print the data directly
		numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		

	}

}
