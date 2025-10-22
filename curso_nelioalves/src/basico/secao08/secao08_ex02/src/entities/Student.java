package basico.secao08.secao08_ex02.src.entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void passOrFailed() {
		double finalGrade = finalGrade();
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		if (finalGrade >= 60.0) {
			System.out.println("PASS");
		} else {
			double missingPoint = 100 - finalGrade;
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoint);
		}
	}
	
}
