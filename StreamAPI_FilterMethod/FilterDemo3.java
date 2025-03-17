package StreamAPI_FilterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		//Filtering null values from the collection, after removing store the values into the another collection
		List<String> words = Arrays.asList("Book",null,"Can",null,"Bag","Pen");
		List<String> results = new ArrayList<String>();
		results = words.stream().filter(s->s != null).collect(Collectors.toList());
		System.out.println(results);
		
		words.stream().filter(s-> s !=null).forEach(System.out::println);
		
		words.stream().filter(s-> s !=null).forEach(s-> System.out.println(s));
		
		
	}

}
