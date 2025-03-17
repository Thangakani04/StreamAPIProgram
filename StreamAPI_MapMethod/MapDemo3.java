package StreamAPI_MapMetho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		
		List<Integer> numList = Arrays.asList(2,3,4,5);
		
		List<Integer> multipliedList = new ArrayList<Integer>();
		
		//Before java 8 
		
		/*
		 * for(int n:numList) { //System.out.println(n*3);
		 * 
		 * multipliedList.add(n*3); }
		 * 
		 * System.out.println(multipliedList);
		 */
		
		//By using stream - map()
		//Multiplying by 3 and store it in another collection
		multipliedList=	numList.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(multipliedList);
		
		//Without storing into another collection , just print it directly
		
		numList.stream().map(n->n*3).forEach(n-> System.out.println(n));
		
		numList.stream().map(n->n*3).forEach(System.out::println); //Directly println method by using ::
		
		

	}

}
