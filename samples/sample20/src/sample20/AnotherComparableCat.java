package sample20;

public class AnotherComparableCat extends Cat implements Comparable<Cat> {
	
    public AnotherComparableCat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public int compareTo(Cat o) {
		return this.getAge() - o.getAge();
	}
}