package basico.secao08.secao08_ex02.src.application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name of student: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		student.passOrFailed();
		
		
		sc.close();
		
	}

}
