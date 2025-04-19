package Streammethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("A","B","C","1","2","3");
		Object[] arr = str.stream().toArray();
		System.out.println(arr.length);
		
		for(Object var :arr) {
			System.out.println(var);
		}

	}

}
