package secao17.aula182.pt2.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		System.out.println(x);
		
		//list.add(20); // vai dar erro por conta da covariância (só funciona o get, mas não o put)
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("João");
		
		List<? super Number> myNums = myObjs;
		myNums.add(50);
		myNums.add(3.4);
		
		//Number y = myNums.get(0); // daria erro por conta da contra variância (aceita put, mas não get)
		Object y = myNums.get(0);
		System.out.println(y);
		
	}

}
