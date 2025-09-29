package exercicios02;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		int numero1, numero2;
		
		System.out.println("Digite um número");
		numero1 = sc.nextInt();
		
		
		if (numero1 >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		if(numero1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		} 
		
		System.out.println("Digite um número");
		numero2 = sc.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		System.out.println("Digite a hora que começou:");
		int horaInicial = sc.nextInt();
		System.out.println("Digite a hora que terminou:");
		int horaFinal = sc.nextInt();
		int duracao;
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU: " + duracao +" HORA(S)");
		
		System.out.println("Digite o código: ");
		int valprod = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int qtd = sc.nextInt();
		double total;
		
		if (valprod == 1) {
			total = qtd * 4.0;
		} else if (valprod == 2){
			total = qtd * 4.5;
		} else if (valprod == 3) {
			total = qtd * 5.0;
		} else if (valprod == 4) {
			total = qtd * 2.0;
		} else {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);*/
		
		
		//System.out.println("Digite um valor: ");
		//double valor = sc.nextDouble();
		/*
	
		if (valor < 25.0 && valor > 0.0) {
			System.out.println("Intervalo (0,25)");
		} else if (valor >= 25.0 && valor < 50.0) {
			System.out.println("Intervalo (25,50)");
		} else if (valor >= 50.0 && valor < 75.0) {
			System.out.println("Intervalo (50,75)");
		} else if (valor >= 75.0 && valor < 100.0) {
			System.out.println("Intervalo (75,100)");
		} else {
			System.out.println("Fora do intervalo");
		}*/
		/*
		System.out.println("Digite o valor de x: ");
		double x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		double y = sc.nextDouble();
		String eixo;
		
		if        (x > 0 && y > 0) {
			eixo = "Q1";
		} else if (x < 0 && y > 0) {
			eixo = "Q2";
		} else if (x < 0 && y < 0) {
			eixo = "Q3";
		} else if (x > 0 && y < 0) {
			eixo = "Q4";
		} else {
			eixo = "Origem";
		}
		
		System.out.println(eixo);*/
		
		System.out.println("Digite o salário: ");
		double salario = sc.nextDouble();
		double imposto; 
		
		if (salario <= 2000.00) {
			imposto = 0.0;
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
		
		sc.close();

	}

}
