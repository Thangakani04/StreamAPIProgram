package StreamAPI;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElementinArray {

	public static void main(String[] args) {
		
		int [] numbers = {5};
		
		if(numbers.length <2) {
			System.out.println("No second largest element");
		}
		
		OptionalInt secLargest = Arrays.stream(numbers)
				.distinct().sorted().skip(numbers.length -2).findFirst();
		
		secLargest.ifPresentOrElse(System.out::println, () -> System.out.println("No largest element"));

	}

}
