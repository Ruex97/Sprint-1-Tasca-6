package exercice1;

public class GenericMethodsV2 {
	
	public static <T> void printArguments(String name, T arg1, T arg2) {
		
		System.out.println("Parameter 1: " + name + " Parameter 2: " + arg1 + " Parameter 3: " + arg2);
	
	}
	
}



