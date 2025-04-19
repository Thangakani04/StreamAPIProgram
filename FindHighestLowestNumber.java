package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindHighestLowestNumber {

	public static void main(String[] args) {
		List<Integer> input =Arrays.asList(2,4,6,75,12,90,24);
		
		Optional<Integer> a = input.stream().max((val1,val2) -> {
			return val1.compareTo(val2);
		});
		
		System.out.println(a.get());

	}

}
