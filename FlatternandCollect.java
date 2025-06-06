package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatternandCollect {
	
	public static void main(String[] args) {
		List<List<Integer>> input = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(2, 3, 4),
			    Arrays.asList(3, 4, 5)
			);
		List<Integer> result = input.stream()
				.flatMap( i -> i.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
