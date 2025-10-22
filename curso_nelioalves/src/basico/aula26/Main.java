package basico.aula26;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Digite um nome: ");
		Scanner sc = new Scanner(System.in);
		 
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		System.out.println("Digite um número: ");
		int y;
		y = sc.nextInt();
	
		System.out.println("Você digitou: " + y);
		
		System.out.println("Digite outro número: ");
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		sc.close();

	}

}
