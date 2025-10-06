package secao14.aula151.model.entities;

import secao14.aula147.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimite;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrawLimite() {
		return withdrawLimite;
	}

	public void setWithdrawLimite(Double withdrawLimite) {
		this.withdrawLimite = withdrawLimite;
	}


	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > this.withdrawLimite) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > this.balance) {
			throw new DomainException("Not enough balance");
		}
		this.balance -= amount;
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "New balance: " + this.getBalance();
	}
	
}
