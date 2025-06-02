package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOccurrence {
	
	public static void main(String[] args) {
		wordsOccurrence();
		wordOccurrence();
	}

	public static void wordOccurrence() {
		
		String str ="Thangakani";
		Map<Object, Long> result = str.chars().mapToObj(c -> (char)c )
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("No of occurence in String : " + result);
		
	}

	public static void wordsOccurrence() {
		
		List<String> words = Arrays.asList("Apple","Banana","Orange","Apple","Orange","Orange");
		
		Map<String, Long> result = words.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("No of occurence in List : " + result);
		
	}
	

}
