package sample20;


public class ComparableCat extends Cat implements Comparable<Cat> {
	
    public ComparableCat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public int compareTo(Cat o) {
		return this.getAge() - o.getAge();
	}
}
