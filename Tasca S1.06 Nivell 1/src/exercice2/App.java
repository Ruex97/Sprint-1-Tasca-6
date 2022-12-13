package exercice2;

public class App {

	public static void main(String[] args) {
		// As 3 the arguments are generic, i can pass any object or primitive data in any order
		
		Persona pers1 = new Persona ("Xavi", "Rue", 25);
		Persona pers2 = new Persona ("Elena", "Vicente", 22);
		
		
		GenericMethods.printArguments(pers1, "programador", 1500);
		GenericMethods.printArguments(1800, "disesenyadora", pers2); 
		
		// When printing an object it will print its memory address
		

	}

}
