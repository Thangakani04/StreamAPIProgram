package StreamAPI;


import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		 Fibonacci() ;
	}
	
	public static void Fibonacci() {
		 
		
		LongStream ll = Stream.iterate(new long[] {1,0} ,f->  new long[] {
				f[1] , f[1]+f[0]}).mapToLong(f-> f[0]);
		ll.limit(6).forEach(System.out::println);
		
		
	}

}