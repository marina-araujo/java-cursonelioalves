package secao18.aula198.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import secao18.aula198.entities.Product;
import secao18.aula198.util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// tem que transformar a lista em stream, chamando a stream() e depois o .map() que é uma função dentro de stream. depois instancia um objeto da classe UpperCaseName dentro da stream pra cada item que era da lista. depois converte de stream para lista chamando o .collect(Collectors.toList()). colocando tudo isso dentro de uma lista de strings chamada name:
		
		// List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList()); 
		
		names.forEach(System.out::println);
		
	}

}
