package aula27;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // ao dar enter após o número digitado, o s1 consome essa quebra de linha
		sc.nextLine(); // fazer esse extra pra consumir a quebra de linha
		s1 = sc.nextLine(); // só o nextLine que aceita o enter como quebra de linha embutida
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
