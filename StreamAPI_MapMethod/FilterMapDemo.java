package StreamAPI_MapMetho;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int eid;
	String ename;	
	int esalary;
	
	Employee(int eid,String ename,int esalary){
		this.eid= eid;
		this.ename= ename;
		this.esalary= esalary;
	}
	
	
}

public class FilterMapDemo {
	
	//Combining filter and map together

	public static void main(String[] args) {
		
		List<Employee> emplist= Arrays.asList(new Employee(1,"Kani",10000),
				new Employee(2,"Ajay",30000),
				new Employee(3,"Sweta",40000),
				new Employee(4,"Loga",20000),
				new Employee(5,"Nivi",34000));
		
		//Collection -> Stream() -> Filter() -> Map() -> collect the data put it in some other collection
		
		//Print salary of employees greater than 20000 and then print salary of every employees
		//Combination of filter() and map()
		//We are collecting only the salary so the target collection should be integer
	List<Integer> sal= emplist.stream().filter(e-> e.esalary>20000) //filtering the data
						.map(e-> e.esalary)
						.collect(Collectors.toList());
	
	System.out.println(sal);
		

	}

}
