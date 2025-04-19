package StreamAPI_FlatMapMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int id;
	char grade;
	
	Student(String name,int id,char grade){
		this.name= name;
		this.id= id;
		this.grade= grade;
		
	}
}

public class FlatMapDemo3 {

	public static void main(String[] args) {
		List<Student> stuList  = new ArrayList<Student>();
		stuList.add(new Student("Kani",101,'A'));
		stuList.add(new Student("Ajay",102,'A'));
		stuList.add(new Student("Swetha",103,'B'));
		stuList.add(new Student("Alex",104,'O'));
		
		List<Student> stuList1  = new ArrayList<Student>();
		stuList1.add(new Student("Akash",105,'A'));
		stuList1.add(new Student("Kayal",106,'C'));
		stuList1.add(new Student("Saro",107,'B'));
		stuList1.add(new Student("Brindha",108,'O'));
		
		List<List<Student>> fList = new ArrayList<List<Student>>();
		
		fList.add(stuList);
		fList.add(stuList1);
		//To fetch the names of the list from the student collection
		
		//Before java 8
		
		for(List<Student> stu:fList) {
			for(Student s :stu) {
				System.out.println(s.name);
			}
		}
		
		//Using stream - flatmap() method
		
		List<String> result = fList.stream()
								    .flatMap(s->s.stream()  //using flatMap and splitting fList into 2 list
								    .map(name->name.name))  //using map passing each & every object into this map from this object im exacting this name
								    .collect(Collectors.toList());
		System.out.println(result);
		

	}

}
