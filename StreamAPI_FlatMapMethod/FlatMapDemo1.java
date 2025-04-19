package StreamAPI_FlatMapMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		
		//Map()
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> list1 = list.stream().map(n-> n+10).collect(Collectors.toList());
		
		System.out.println(list1);
		
		//FlatMap()
		
		List<Integer> lst1 = Arrays.asList(1,2);
		List<Integer> lst2 = Arrays.asList(3,4);
		List<Integer> lst3 = Arrays.asList(5,6);
		
		//If we want to add these 3 collection(lst1 , lst2 , lst3) into the single collection
		List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);
		
		//To process this above complex data we use FlatMap
		//Flatmap will return streams of objects
		List<Integer>finalResults = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(finalResults);
		
		List<Integer>finalResults1 = finalList.stream().flatMap(x->x.stream()).map(n-> n+10).collect(Collectors.toList());
		
		System.out.println(finalResults1);
		
		
	}

}
