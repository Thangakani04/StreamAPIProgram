package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee77 {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    
    
	public Employee77(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee77 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	

    
}

public class GroupByStream {
	
	public static void main(String[] args) {
		
		List<Employee77> Employee7s = Arrays.asList(
			    new Employee77(1, "Alice", "HR", 50000),
			    new Employee77(2, "Bob", "IT", 60000),
			    new Employee77(3, "Charlie", "HR", 55000),
			    new Employee77(4, "David", "IT", 70000),
			    new Employee77(5, "Eve", "Sales", 45000)
			);
		
		Map<String, List<String>> output = Employee7s.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(emp -> emp.getName(), Collectors.toList()))) ;
		
		output.entrySet().forEach(ent -> System.out.println(ent.getKey() + " "+ ent.getValue()));
		//System.out.println(output);
		
	}

}
