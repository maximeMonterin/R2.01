package exo2;

public class Customer {
	
	private int ID;
	private String name;
	private char gender;
	
	public Customer(int iD, String name, char gender) {
		this.ID = iD;
		this.name = name;
		this.gender = gender;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return this.name + '(' + this.ID + ')';
	}
	
	
}
