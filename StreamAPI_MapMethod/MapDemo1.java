package StreamAPI_MapMetho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	//Convert each and every element to upper case letter and store it to another collection

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Banana","Apple","Orange","Orange","Pomegranate");
		
		List<String> upperFruits = new ArrayList<String>();
		
		//Without stream - Before java8
		/*for(String f:fruits) {
			upperFruits.add(f.toUpperCase());
		}
		
		System.out.println(upperFruits);*/
		
		//By using Stream
		
		upperFruits= fruits.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperFruits);
		
		fruits.stream().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
	
		fruits.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		
	}
}
