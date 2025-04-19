package Streammethods2;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
	
	//anyMatch()
	//allmatch()
	//nonematch()

	public static void main(String[] args) {
		
		//Set & List differenec is -> Set doesn't allows duplicates, List allows duplicates
		
		Set<String> Colours = new HashSet<String>();
		
		Colours.add("One Yellow");
		Colours.add("Two Red");
		Colours.add("One Orange");
		Colours.add("Two greens");
		Colours.add("One White");
		
		//anyMatch()
		
		boolean result = Colours.stream().anyMatch(value -> {
			return value.startsWith("One");  //if any of the value starts with one then it will return true
		});
		
		System.out.println(result);
		
		//allMatch()  --> every values should start with one else it will return false
		
		boolean result1 = Colours.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		
		System.out.println(result1);
		
		//nonematch()
		
		boolean result2 = Colours.stream().noneMatch(value->{
			return value.startsWith("one");
		});
		
		System.out.println(result2);
		

	}

}
