package basico.exercicios04;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int i;
		
		for (i=0; i<=X; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
