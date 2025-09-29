package secao13.aula135.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import secao13.aula135.entities.Employee;
import secao13.aula135.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsorced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			if (outsorced == 'y') {
				System.out.print("Addition charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, value, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, value);
				list.add(emp);
			}			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();

	}

}
