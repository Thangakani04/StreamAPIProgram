package Streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	//count
	long evennumbers= numbers.stream().filter(num-> num%2==0).count();
	System.out.println(evennumbers);
	
	//min
	Optional<Integer> min = numbers.stream().min((val1,val2)->{
		return val1.compareTo(val2);
	});
	System.out.println(min.get());

	Optional<Integer> max =numbers.stream().max((val1,val2)->{
		return val1.compareTo(val2);
		
	});
	System.out.println(max.get());
	
	}
	
	

}
