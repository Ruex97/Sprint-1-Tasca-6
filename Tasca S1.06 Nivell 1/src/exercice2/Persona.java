package exercice2;

public class Persona<T> {
	
	private T name;
	private T surname;
	private T age;
	
	public Persona(T name, T surname, T age) {
	
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getSurname() {
		return surname;
	}
	public void setSurname(T surname) {
		this.surname = surname;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	
	
	
	
	

}
