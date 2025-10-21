package secao16.aula165.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.aula165.model.entities.CarRental;
import secao16.aula165.model.entities.Vehicle;
import secao16.aula165.model.services.BrazilTaxService;
import secao16.aula165.model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:ss): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:ss): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		
		sc.close();
		
	}

}
