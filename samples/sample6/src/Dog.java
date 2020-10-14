public class Dog {

	// public nested classes
	public static class Breed {

		private String name;

		public Breed(final String name) {
			this.name = name;
		}
	}

	public static final Breed AFADOR = new Breed("Afador");

	public static final Breed JACK_CHI = new Breed("Jack Chi");
	
	private Breed breed;

	private String name;
	
	public Dog(final String name, final Breed breed) {
		this.name = name;
		this.breed = breed;
	}

	void print() {
		System.out.println(name + " " + breed.name);
	}
}
