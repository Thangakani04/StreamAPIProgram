package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	
	public static void main(String[] args) {
		groupbyLen();
	}
	
	public static void groupbyLen() {
		List<String> input = Arrays.asList("hi", "hello", "hey", "world");
		Map<Integer, List<String>> result = input.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(result);	
	}


}
