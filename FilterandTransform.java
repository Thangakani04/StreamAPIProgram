package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age= age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class FilterandTransform {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
			    new Person("Alice", 23),
			    new Person("Bob", 17),
			    new Person("Charlie", 19),
			    new Person("David", 15),
			    new Person("Eve", 21));
		List<String> result = people.stream()
				.filter(p -> p.getAge() >= 18)
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.map(p -> p.getName()).toList();
		System.out.println(result);
		List<String> result1 = people.stream().filter(p -> p.getAge() >=18)
				.sorted((p1,p2) -> Integer.compare(p2.getAge(), p1.getAge())).map(p -> p.getName()).collect(Collectors.toList());
				
		System.out.println(result1);
				}
				
				
		
		
	}


