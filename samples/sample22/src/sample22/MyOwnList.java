package sample22;

import java.util.AbstractList;

public class MyOwnList extends AbstractList<String>{

	@Override
	public String get(int index) {
		if(index == 0) {
			return "Hello";
		}
		else if(index == 1) {
			return "World";
		}
		return null;
	}

	@Override
	public int size() {
		return 2;
	}

}
