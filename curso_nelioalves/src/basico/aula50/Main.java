package basico.aula50;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cont = sc. nextInt();
 
		int i;
		int soma = 0;
		
		for (i=0; i < cont; i++) {
			int numero = sc.nextInt();
			soma += numero;
			
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
