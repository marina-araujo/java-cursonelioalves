package secao17.aula189.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997788558");
		
		cookies.remove("email");
		cookies.put("phone", "889988775"); // vai sobrescrever o antigo pois não admite repetições
		
		System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
