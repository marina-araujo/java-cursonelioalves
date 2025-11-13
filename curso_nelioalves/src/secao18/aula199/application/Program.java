package secao18.aula199.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import secao18.aula199.entities.Product;
import secao18.aula199.model.services.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Monitor", 150.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		System.out.println("Sum with M = " + String.format("%.2f", sum));
		
		double sum2 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum with T = " + String.format("%.2f", sum2));
		
		double sum3 = ps.filteredSum(list, p -> p.getPrice() < 160.0);
		System.out.println("Sum with < 160 = " + String.format("%.2f", sum3));

	}

}
