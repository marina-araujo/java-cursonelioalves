package exercicios03;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha sua opção (de 1 a 4)");
		
		int op = sc.nextInt();
		int alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		while(op!=4) {
			switch(op) {
			case 1:
				alcool ++;
				op = sc.nextInt();
				break;
			case 2:
				gasolina ++;
				op = sc.nextInt();
				break;
			case 3:
				diesel ++;
				op = sc.nextInt();
				break;
			default:
				op = sc.nextInt();
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
