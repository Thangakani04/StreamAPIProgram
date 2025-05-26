package InterviewProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceofNumber {
	
	public static void main(String[] args) {
		
		occurrenceofnumber();
		occurrenceofCharacter();
	}

	public static void occurrenceofCharacter() {
		
		List<String> list = Arrays.asList("Thangakani" ,"Ajay","Nivedha");
		for(String s: list) {
		//String str = "Thangakani";
		Map<Character,Long> result = s.chars()
				.mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
		}
		
	}

	public static void occurrenceofnumber() {
		List<Integer> list = Arrays.asList(1,1,1,2,2,2,2,4,4,3,5,5,6,6,6,6,6,6);
		Map<Integer, Long> hs = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(hs);
				
		
	}

}
