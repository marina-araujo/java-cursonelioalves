package basico.exercicios03;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para X: ");
		x = sc.nextInt();
		System.out.println("Digite um valor para Y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
				
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
				
			} else if(x < 0 && y < 0) {
				System.out.println("terceiro");
		
			} else {
				System.out.println("quarto");

			}
			System.out.println("Digite um valor para X: ");
			x = sc.nextInt();
			System.out.println("Digite um valor para Y: ");
			y = sc.nextInt();
		}
		
		System.out.println("fora do programa");
		
		sc.close();
		
	}

}
