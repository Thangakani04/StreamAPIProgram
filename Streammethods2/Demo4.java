package Streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
	
	//Concatenating streams

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Mango","Grapes");
		
		List<String> vegetables = Arrays.asList("Carrot","Potato","Tomato","Chilly");
		
		//adding collections into stream
		
		Stream<String> stream1 = fruits.stream();
		
		Stream<String> stream2 = vegetables.stream();
		
		//concatenating stream 1 and stream 2
		
		List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		//print data from finallist using for each
		
		for(String l : finalList) {
		
		System.out.println(l);
		}
		

		
		

	}

}
