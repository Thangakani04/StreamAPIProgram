package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class EmployeePractice{
	String name;
	int age;
	double salary;
	
	EmployeePractice(String name, int age,double salary){
		this.name =name;
		this.age= age;
		this.salary= salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class EmployeeStream {
	
	public static void main(String[] args) {
		
		List<EmployeePractice> list = Arrays.asList(new EmployeePractice("Kani",25,57000.00),
				new EmployeePractice("Ajay",26,60000.00),
				new EmployeePractice("Anu",24,30000.00),
				new EmployeePractice("Saro",23,45000.00),
				new EmployeePractice("Nivi",27,70000.00),
				new EmployeePractice("Swetha",22,25000.00));
		
		//Find a list of names of employees whose salary is greater than 50000
		
		List<EmployeePractice> result = list.stream().filter(emp -> emp.salary > 50000.00)
				.collect(Collectors.toList());
		
		System.out.println("Names of employees whose salary is greater than 50000");
		result.forEach(emp -> {
			System.out.println(emp.name);
		});
		
		//Find the average salary of employees who are older than 30
		
		double result1 = list.stream().filter( emp -> emp.age >30)
				.mapToDouble(emp -> emp.salary).average().orElse(0.0);
		System.out.println("Average salary of employees who are older than 30" + result1);
		
		//Sort the employees by salary in descending order and return the top 3 highest paid employee
				
				List<EmployeePractice> result2 = list.stream()
						.sorted(Comparator.comparingDouble((EmployeePractice emp) -> emp.salary).reversed())
						.limit(3)
						.collect(Collectors.toList());
				
				System.out.println("Top 3 highest salary employees");
				for(EmployeePractice e : result2) {
				System.out.println(e.name);
				}
				
						
		
		
	}

}
