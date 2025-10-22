package secao16.aula170.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int months);

}
