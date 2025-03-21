package Streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		//distinct() limit() -> Non terminal operations/processing methods
		//count() forEach() -> Terminal operation
		
		//define one collection and find unique objects (distinct objects)
		
		
		//Distinct
		List<String>vehicleList = Arrays.asList("bus" ,"car" ,"bicycle" ,"bus" ,"car" ,"car","bike");
		
		//List<String > distinctVehicles=vehicleList.stream().distinct().collect(Collectors.toList());
		//System.out.println(distinctVehicles);
		
		// we dont want to store it to some other collection, we just want to print those objects
		
		//vehicleList.stream().distinct().forEach(value-> System.out.println(value));
		
		//vehicleList.stream().distinct().forEach(System.out::println);
		
		
		//Count
		long count = vehicleList.stream().distinct().count();  //Count is terminal method
		//System.out.println(count);
		
		//Limit - non terminal method
		
		List<String> output = vehicleList.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(output);
		vehicleList.stream().limit(3).forEach(value-> System.out.println(value));
		
		
		
	}

}
