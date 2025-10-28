package secao17.aula182.apllication;

import java.util.ArrayList;
import java.util.List;

import secao17.aula182.entities.Circle;
import secao17.aula182.entities.Rectangle;
import secao17.aula182.entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
		
	}

}
