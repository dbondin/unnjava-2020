package sample20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AAA <T, V, O> {
	private T t;
	private V v;
	private O[] array;
}
