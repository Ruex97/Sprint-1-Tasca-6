package exercice1;

public class App {
	
	public static void main (String args[]) {
		
		Smartphone phoneToCall = new Smartphone("650257894");
		
		Generic.TelephoneMethods(phoneToCall);
		
		
		Generic.SmarthphoneMethods(phoneToCall); //This line calls the two methods of class Smartphone
		
		// The TelephoneMethods can't call takeAPicture method because it doesn't belong 
		// to the interface Telephone, and as I'm restricting the arguments to be only 
		// from this interface, it's not possible
	
	}
	
	
	

}
