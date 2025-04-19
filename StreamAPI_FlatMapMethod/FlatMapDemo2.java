package StreamAPI_FlatMapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<String> BestTeam= Arrays.asList("Kani","Swetha","Loga");
		List<String> WorstTeam = Arrays.asList("Priya","Narmada","Sagu");
		List<String> averageTeam =  Arrays.asList("Ajay","Alex","Subash");
		
		//Add these collections into one big collection
		
		List<List<String>> TotalMembers =  new ArrayList<List<String>>();  //this collection should able to hold 3 type of collection

		TotalMembers.add(BestTeam);
		TotalMembers.add(WorstTeam);
		TotalMembers.add(averageTeam);
		
		//I want to read each individual member names
		//before java8 -using enhanced for loop
		
		/*
		 * for(List<String> mem:TotalMembers) { //here mem is also a collection
		 * 
		 * for(String m: mem) { System.out.println(m); }
		 * 
		 * }
		 */
		
		//Using stream - flatMap()
		List<String> names = TotalMembers.stream().flatMap(p-> p.stream()).collect(Collectors.toList());
		System.out.println(names);
		
		
	}

}
