package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employees {
    String name;
    String department;
    
    Employees(String name, String department){
    	this.name = name;
    	this.department = department;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
    
    
}

public class GroupEmployeesbyDepartmentCount {
	
	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(
			    new Employees("Alice", "HR"),
			    new Employees("Bob", "Engineering"),
			    new Employees("Charlie", "HR"),
			    new Employees("David", "Engineering"),
			    new Employees("Eve", "HR")
			);
		
		Map<String, Long> hm = employees.stream()
				.map(emp -> emp.getDepartment())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(hm);
		
		
	}

}
