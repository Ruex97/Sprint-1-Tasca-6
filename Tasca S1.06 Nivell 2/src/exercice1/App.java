package exercice1;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		HashMap<String, String> myMap = new HashMap<>();
		
		// I can put any object or primitive data where arguments are generic. As first argument
		// must be a String, is the only i have to respect the order and type.
		GenericMethodsV2.printArguments("ThisMustBeAString", array, myMap);
		GenericMethodsV2.printArguments("ThisMustBeAString", 4, array2);
		
		// As the first argument is not a String this line will give us an error
		// GenericMethodsV2.printArguments(myMap, array, "ThisMustBeAString");
		
		

	}

}
