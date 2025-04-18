package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,4,5,6,7,8,9);
		
		List<Integer> evenNumbers = numbers.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
