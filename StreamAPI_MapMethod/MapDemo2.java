package StreamAPI_MapMetho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
	
	//Find length of each and every element of string and store it in some other collection

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Banana","Apple","Orange","Orange","Pomegranate");
		
		List<String> upperFruits = new ArrayList<String>();
		
		//without using stream - before jave 8 
		
		for(String s:fruits) {
		System.out.println(s.length());
		}
		
		//using Stream
		
		//fruits.stream().map(f->f.length()).forEach(len-> System.out.println(len));
		
		fruits.stream().map(f->f.length()).forEach(System.out::println);
		
		
		
		
		
		

	}

}
