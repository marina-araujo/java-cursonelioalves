package secao17.aula181.application;

import java.util.List;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println();
		
		List<String> myStrs = Arrays.asList("Ana", "Bob", "Alex");
		printList(myStrs);

	}
	
	public static void printList(List<?> list ) {
		for(Object obj : list ) {
			System.out.println(obj);
		}
	}

}
