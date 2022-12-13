package exercice2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// I create two different ArrayList, two test if my method, that receives an ArrayList<T>
		// could handle both.
		
		ArrayList<String> presidents = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		
		presidents.add("Obama");
		presidents.add("Bush");
		presidents.add("Trump");
		
		ages.add(5);
		ages.add(15);
		ages.add(52);
		
		GenericMethodsV3.printArguments(presidents);
		GenericMethodsV3.printArguments(ages);
		

	}

}
