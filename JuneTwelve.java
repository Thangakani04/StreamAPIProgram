package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee8 {
    String name;
    int salary;

    Employee8(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String toString() {
        return name + " - " + salary;
    }
}

public class JuneTwelve {
	
	
	
	public static void main(String[] args) {
		fisrtNonRepeatingcharacter();
		findDuplicatesElementsInList();
		groupStringsByLength();
		sumOfAllevenNumbers();
		
	}

	
	public static void sumOfAllevenNumbers() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer num = nums.stream().filter( n -> n%2 ==0)
				.mapToInt( n -> n).sum();
		System.out.println(num);
				
				
		
	}

	public static void groupStringsByLength() {
		List<String> words = Arrays.asList("apple", "bat", "banana", "cherry", "dog");
		Map<Integer,List<String>> result = words.stream()
				.collect(Collectors.groupingBy(str-> str.length()));
		
		System.out.println(result);
				
		
	}

	public static void findDuplicatesElementsInList() {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6, 7);
		List<Integer> result = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() >1)
				.map(ent -> ent.getKey())
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

	public static void fisrtNonRepeatingcharacter() {
		String str = "programming";
		Character c = str.chars().mapToObj( ch -> (char)ch)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() ==1)
				.map(ent -> ent.getKey())
				.findFirst()
				.orElse(null);
		System.out.println(c);
		
	}

}
