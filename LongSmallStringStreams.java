package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongSmallStringStreams {
	
	public static void main(String[] args) {
		longestString();
		System.out.println(Math.sqrt(4));
	}

	public static void longestString() {
		
		List<String> words = Arrays.asList("Thangakani" ,"Saro" ,"Nivi" ,"Kayal" ,"Sumitha");
		Optional<String> longString = words.stream().max(Comparator.comparingInt(String::length));
		System.out.println(longString.get());
		
		Optional<String> smallString = words.stream().min(Comparator.comparingInt(String::length));
		System.out.println(smallString.get());
	}

}

