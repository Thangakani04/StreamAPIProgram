package Streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,6,7,8,9);
		
		List<Integer> Sortedlist = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(Sortedlist);  //Default - ascending order
		
		//To sort the elements in reverse order
		
		List<Integer> revSortedlist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(revSortedlist);  //descending order
		
		//Strings
		
		List<String> list2 = Arrays.asList("Kayal","Kani","Nivi","Loga");
		
		List<String> Sortedlist2 = list2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(Sortedlist2);  //Ascending order
		
		//Reverse order
		
		List<String> ReverseSortedlist2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(ReverseSortedlist2);  //Ascending order
		
		
		
	}

}
