package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
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

public class EmployeeProgram {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Kani" ,25 ,20000.00),
				new Employee("Saro" ,29 ,60000.00),
				new Employee("Rajan" ,35 ,50000.00)
				);
				/*
				 * List<Employee> empl = emp.stream().sorted((e1,e2) ->
				 * Double.compare(e2.salary, e1.salary)) .collect(Collectors.toList());
				 * empl.forEach(System.out::println);
				 */
		
		List<Employee> empresult = emp.stream().sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.collect(Collectors.toList());
		empresult.forEach(System.out::println);
		
		List<Employee> empresult1 = emp.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder()))
				.collect(Collectors.toList());
		empresult1.forEach(System.out::println);
	}

}
