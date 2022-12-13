package exercice2;

import java.util.ArrayList;

public class GenericMethodsV3 {
	
	public static <T> void printArguments(ArrayList<T> array) {
		
		System.out.println("Parameter 1: " + array.get(0) + " Parameter 2: " + array.get(1) + " Parameter 3: " + array.get(2));
	
	}
	
}



