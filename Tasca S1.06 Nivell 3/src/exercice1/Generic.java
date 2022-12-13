package exercice1;

import java.util.Scanner;

public class Generic<T> {
	/*. Des d’aquests dos mètodes crida els
mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa 
un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.*/
	
	
	public static <T extends Telephone> void TelephoneMethods(T myPhone) {
		
		String phoneNumber = readString("Which number are you calling");
		myPhone.call(phoneNumber);
		
	
		
	}
	
	public static <T extends Smartphone> void SmarthphoneMethods(T myPhone) {
		String phoneNumber = readString("Which number are you calling");
		myPhone.call(phoneNumber);
		myPhone.takePictures();
		
	}
	
	
	
	
	
	
	public static String readString(String sentence) {
		Scanner input = new Scanner(System.in);
		String str = "";
		do {
	         System.out.println(sentence);
	         try {
	        	 str = input.nextLine();
	         } catch (Exception e) {
	             System.out.println("error en la introduccion del String");
	         }
	     } while (str.equals(""));
	     return str;
	}
	
	

}


