package secao18.aula193.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import secao18.aula193.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());		
		
		/* FORMA COM {} E COM RETURN:
		 * Comparator<Product> comp = (p1, p2) -> { // uso de função anônima (expressão lambda). compilador dispensa a declaração do tipo junto dos parâmetros
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		*/
		
		list.sort(comp);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
