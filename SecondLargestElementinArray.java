package StreamAPI;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElementinArray {

	public static void main(String[] args) {
		
		int [] numbers = {2,7,89,45,25,1,0,47};
		
		OptionalInt secLargest = Arrays.stream(numbers)
				.distinct().sorted().skip(numbers.length - 2).findFirst();
		
		secLargest.ifPresentOrElse(System.out::println, () -> System.out.println("No largest element"));

	}

}
