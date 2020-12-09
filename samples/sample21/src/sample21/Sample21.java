package sample21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

// LAMBDAS in java

public class Sample21 {
	public static void main(String[] args) {
		
		// Comparable<T>
		
		Cat array [] = new Cat[] {
			new Cat("Tom", 80),
			new Cat("Jerry", 30),
			new Cat("Pus", 15),
			new Cat("Mia", 5),
			new Cat("Jenny", 20),
			new Cat("Peter", 17),
			new Cat("Johny", 1)
		};
		
		//CatComparator cc = new CatComparator();
		
		Arrays.<Cat>sort(array, new Comparator<Cat>() {
			@Override
			public int compare(Cat o1, Cat o2) {
				return o2.getAge() - o1.getAge();
			}
		});
		
		Arrays.<Cat>sort(array, (o1, o2) -> o2.getAge() - o1.getAge()); // Lambda expression
		
		Arrays.<Cat>sort(array, (o1, o2) -> {
			// some long-logic ...
			//
			//
			return o2.getAge() - o1.getAge();
		}); // Lambda expression
		
		for(Cat c : array) {
			System.out.println(c);
		}
		
		System.out.println("---");
		
		Arrays.asList(array).stream()
			.filter(c -> ( c.getAge() >= 15)) // Predicate
			.peek(c -> c.setName(c.getName().toUpperCase()))
			.forEach(c -> System.out.println(c));
		
		Arrays.asList(array).stream()
				.filter(new Predicate<Cat>() {
					public boolean test(Cat t) {
						return t.getAge() >= 15;
					};
				}) // Predicate
				.peek(new Consumer<Cat>() {
					public void accept(Cat t) {
						t.setName(t.getName().toUpperCase());
					}
				})
				.forEach(new Consumer<Cat>() {
					public void accept(Cat t) {
						System.out.println(t);
					}
				});
	}
}
