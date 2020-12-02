package sample16;

public enum Beatle {
	John("Lennon"), Paul("McCartney"), George("Harrison"), Ringo("Star");
	
	Beatle(String lastName) {
		this.lastName = lastName;
	}
	
	private final String lastName;
	
	public String getLastName() {
		return lastName;
	}
}
