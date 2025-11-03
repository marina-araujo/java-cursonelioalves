package secao17.aula183.application;

import secao17.aula183.entities.Client;

public class Program {

	public static void main(String[] args) {

		String a = "Maria Silva";
		String b = "Mariana";
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@mail.com");
		Client c3 = new Client("Alex", "alex@mail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c2.equals(c3));
		
		System.out.println(c2 == c3);
		
		System.out.println(s1 == s2);
		
	}

}
