package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employeess {
    private int id;
    private String name;
    private String gender; // "Male" or "Female"
    private String department;
    private double salary;
    
    
    
	public Employeess(int id, String name, String gender, String department, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

    
}

public class EmpDepartment {
	
	public static void main(String[] args) {
		
		String s = "ajayYesuraja";
		nonrepeatingCharacter(s);
		
		List<Employeess> employees = Arrays.asList(
	            new Employeess(1, "Alice", "Female", "HR", 50000),
	            new Employeess(2, "Bob", "Male", "IT", 70000),
	            new Employeess(3, "Carol", "Female", "Finance", 65000),
	            new Employeess(4, "David", "Male", "IT", 72000),
	            new Employeess(5, "Eve", "Female", "HR", 55000),
	            new Employeess(6, "Frank", "Male", "Finance", 60000),
	            new Employeess(7, "Grace", "Female", "IT", 68000),
	            new Employeess(8, "Henry", "Male", "HR", 53000)
	        );
		Map<String, Double> result = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment() , Collectors.averagingDouble(emp -> emp.getSalary())));
		System.out.println(result);
		
		Map<String,Map<String,Long>> count = employees.stream()
				.collect(Collectors.groupingBy( emp -> emp.getDepartment(),Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting())));
		System.out.println(count);
		
	}

	private static void nonrepeatingCharacter(String s) {
		
		Character result = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity() , () -> new LinkedHashMap<>(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() == 1)
				.map(ent -> ent.getKey())
				.findFirst().orElse(null)
				;
		
		System.out.println(result);
		
		List<Character> result1 = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity() , () -> new LinkedHashMap<>() , Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() == 1)
				.map(ent -> ent.getKey())
				.collect(Collectors.toList());
				
		
		System.out.println(result1);
				
				
				
		
		
	}
	
	
		
			

}
