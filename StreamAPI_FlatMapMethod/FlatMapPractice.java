package StreamAPI_FlatMapMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractice {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> groupList = Arrays.asList(list1,list2,list3);
		
		List<Integer> finalresult = groupList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(finalresult);
		
		List<Integer> finResult = groupList.stream().flatMap(x-> x.stream()).map(e -> e +10).collect(Collectors.toList());
		System.out.println(finResult);
		
	}

}
