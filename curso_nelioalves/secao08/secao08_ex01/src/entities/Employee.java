package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double net = grossSalary - tax;
		return net;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name
				+ ", "
				+ "$ "
				+ String.format("%.2f", netSalary());
	}

}
