package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupOfAnagrams {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("TCS","CTS","cat","tac","nip","pin","Kani");
		AnagramMethod(words);

	}

	public static void AnagramMethod(List<String> words) {
		
		Map<Object, List<String>> anagram = words.stream().collect(Collectors.groupingBy(s -> {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			return new String(c);
			
			
		}));
		
		System.out.println(anagram);
				
				
		
		
	}

	

}
