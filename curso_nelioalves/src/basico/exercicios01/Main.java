package basico.exercicios01;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 2 números para somar: ");
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = A + B;
		System.out.println("SOMA = " + C);
		
		System.out.println("Digite um raio de um círculo para descobrir sua área: ");
		double raio, area;
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("A=%.4f%n", area);
		
		System.out.println("Digite: o número do funcionário, depois a quantidade de horas trabalhadas e o valor da sua hora.");
		int NUMBER;
		double totalhoras, valhora, SALARY;
		NUMBER = sc.nextInt();
		totalhoras = sc.nextDouble();
		valhora = sc.nextDouble();
		SALARY = totalhoras * valhora;
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		
		int np1, np2, qtp1, qtp2;
		double vup1, vup2, vtp1, vtp2, vtotal;
		System.out.println("Digite o código, a quantidade e o valor unitário das peças 1");
		np1 = sc.nextInt();
		qtp1 = sc.nextInt();
		vup1 = sc.nextDouble();
		vtp1 = qtp1 * vup1;
		System.out.println("Digite o código, a quantidade e o valor unitário das peças 2");
		np2 = sc.nextInt();
		qtp2 = sc.nextInt();
		vup2 = sc.nextDouble();
		vtp2 = qtp2 * vup2;
		vtotal = vtp1 + vtp2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vtotal);
		
		
		
		
		
		sc.close();
		
	}

}
