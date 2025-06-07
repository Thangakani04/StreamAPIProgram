package InterviewProblems;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingcharacter {
	
	public static void main(String[] args) {
		
		String name = "swiss";
		Character result = name.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream()
				.filter( ent -> ent.getValue() ==1)
				.map(ent -> ent.getKey())
				.findFirst().orElse(null);
		System.out.println(result);
	}

}
