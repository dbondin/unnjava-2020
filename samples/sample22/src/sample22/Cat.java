package sample22;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Cat implements Comparable<Cat> {
	
	private String name;
	private int age;
	
	@Override
	public int compareTo(Cat o) {
		if(this.age == o.age) {
			return this.name.compareTo(o.name);
		}
		return this.age - o.age;
	}
}
