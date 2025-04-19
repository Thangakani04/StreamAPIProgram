package StreamAPI_FilterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Thangakani","Preethi" ,"Kayalvili","Nivetha","Swetha","Nandhini");
		
		List<String> LongName = new ArrayList<String>();
		
		LongName = names.stream().filter(s -> (s.length()> 6 && s.length()<9)).collect(Collectors.toList());
		
		System.out.println(LongName);
		
		names.stream().filter(s -> (s.length()> 6 && s.length()<9)).forEach(str-> System.out.println(str));
		
		names.stream().filter(s -> (s.length()> 6 && s.length()<9)).forEach(System.out::println);
		
	}

}
