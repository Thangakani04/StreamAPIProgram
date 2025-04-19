package StreamAPI_FilterMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(101,"Lenova Laptop",10000));
		productList.add(new Product(102,"Hp Laptop",30000));
		productList.add(new Product(103,"Dell Laptop",40000));
		productList.add(new Product(104,"Apple Laptop",90000));
		productList.add(new Product(105,"Sony Laptop",25000));
		
	//	productList.stream().filter(p -> p.price > 25000).collect(Collectors.toList());  //p -> p is Product object
		
		//Print the price of the object only
		
		productList.stream().filter(p -> p.price > 25000)  //Filtering objects
							.forEach(pr -> System.out.println(pr.price));  //Iterating and Collecting Objects
		
		
		

	}

}
