package ParellelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
	
	String name;
	int score;
	
	public String getName() {   //getName() method will return the name of the student
		return this.name;
	}
	
	public int getScore() {   	//getScore() method will return the score of the student
		return this.score;
	}



Student(String name,int score){  //constructor by using this keyword we can differentiate local variable into class variable
	this.name = name;
	this.score = score;
}
}

public class ParellelStreamsDemo1 {

	public static void main(String[] args) {
		
		List<Student> student = Arrays.asList(new Student("Kani" ,99),
				new Student("Loga",95),
				new Student("Nivi",60),
				new Student("Kayal",90),
				new Student("Mani",78),
				new Student("Saras",96),
				new Student("Sweta",75),
				new Student("Sumi",68));
		
		//Sequential stream - Stream()
		
		student.stream().filter(stu-> stu.score>=80)
						.limit(3)  //After filtering the stream we are limiting them into 2
						.forEach(stu -> System.out.println(stu.getName()+ " " +stu.getScore()));
		
		//Using paralell stream 
		
		student.parallelStream()
			   .filter(stu->stu.score>=80)
			   .limit(3)
			   .forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		
		//convert sequential stream to paralellStream() 
		//by using paralell() method 
		
		student.stream().parallel().filter(stu-> stu.score>=80)
			   .limit(3)  //After filtering the stream we are limiting them into 2
			   .forEach(stu -> System.out.println(stu.getName()+ " " +stu.getScore()));
		
		
		
	}

}
