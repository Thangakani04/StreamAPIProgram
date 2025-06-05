package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesinList {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6);
		
		List<Integer> result = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(ent -> ent.getKey())
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
