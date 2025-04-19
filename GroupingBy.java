package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
	
	public static void main(String[] args) {
		
		
		List<String> words = Arrays.asList("TCS","CTS" ,"NIP","PIN","list","silt","kani");
		
		Map<Object, List<String>> output = words.stream().collect(Collectors.groupingBy(str-> {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			return new String(c);
			
		}));
		
		System.out.println(output);
	}

}
