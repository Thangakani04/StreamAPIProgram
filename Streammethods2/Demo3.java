package Streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
	
	//findAny() -> will return any element from the stream
	//findFirst() -> will return first element from the stream

	public static void main(String[] args) {
		
		//findAny()
		
		List<String> list = Arrays.asList("One","Two","Three","Four","Five");
		List<String> list1 = Arrays.asList();
		
		//Optional<String> ele = list1.stream().findAny();  //if it doesnt have any element it will return null
		
		//System.out.println(ele.get());
		
		
		//findFirst()
		
		List<String> list2 = Arrays.asList("One","Two","Three","Four","Five");
		
		Optional<String> ele1 = list2.stream().findFirst();   // it will return the first element from the stream and also it will return optional type 
		
		System.out.println(ele1.get());
		
		//if list doesn't have any elements
		
		List<String> list3 = Arrays.asList();
		
		Optional<String> ele2 = list3.stream().findFirst(); 
		
		System.out.println(ele2.get());  // no such element exception
		
		
		

	}

}
