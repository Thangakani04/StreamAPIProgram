package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblems {

	public static void main(String[] args) {
		
		convertTouppercase();
		countCharactersStartswithA();
		//findfirstnonrepetivecharacter();
		joinStringswithadelimiter();
			
		
	}

	private static void joinStringswithadelimiter() {
		
		
	}

	
	public static void countCharactersStartswithA() {
		
		List<String> str = Arrays.asList("Apple", "banana", "Avocado", "cherry", "apricot");
		long output = str.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).count();
		System.out.println("countCharactersStartswithA :" + output);
		
		
	}

	public static void convertTouppercase() {
		List<String> str  = Arrays.asList("apple", "banana", "cherry");
		List<String> output = str.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("convertTouppercase : " + output);
		
	}

}
