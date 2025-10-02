package secao13.aula139.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.aula139.entities.Contribuintes;
import secao13.aula139.entities.PessoaFisica;
import secao13.aula139.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.println("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Pessoa Física ou Pessoa Jurídica (f/j)? ");
			char p = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			if(p == 'f') {
				System.out.print("Gastos com Saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS DE RENDA:");
		double sum = 0;
		for(Contribuintes cont : list) {
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.impostoRenda()));
			sum += cont.impostoRenda();
		}
		
		System.out.println();
		
		System.out.println("TOTAL DE IR: $ " + String.format("%.2f", sum));
		
		sc.close();

	}

}
