package secao10.ex02.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i<n; i++) { 
			System.out.print(vect[i] + " ");
		}
		System.out.println(" ");
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += vect[i];		
		}
		System.out.println("SOMA = " + sum);
		int avg = 0;
		avg = sum / n;
		System.out.println("MEDIA = " + avg);
		

		 
		
		sc.close();
		

	}

}
