package exercice1;

public class Smartphone implements Telephone{
	
	private String phonenumber;
	
	public Smartphone(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	
	@Override
	public void call(String phonenumber) {
		System.out.println("You're calling " + phonenumber);
		
	}

	
	public String getPhonenumber() {
		return phonenumber;
	}


	public void takePictures() {
		System.out.println("You're taking a pictrue");
	}
	
	
}


