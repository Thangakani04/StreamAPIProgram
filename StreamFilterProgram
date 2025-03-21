package Problems;

import java.util.Arrays;
import java.util.Optional;

public class StreamFilterString {

	public static void main(String[] args) {
	
		String input = "my animal name is anu";
		
		Optional<String> result = Arrays.stream(input.split(" "))
				.filter(word -> word.startsWith("a"))
				.skip(1)
				.findFirst();
		
		result.ifPresent(System.out::println);

	}

}
