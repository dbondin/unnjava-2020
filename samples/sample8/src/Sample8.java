
public class Sample8 {
	
	static void printInts(int x) {
		System.out.println(x);
	}
	
	static void printInts(int x, int y) {
		System.out.println("" + x + ", " + y);
	}
	
	static void printInts(int x1, int x2, int x3) {
		System.out.println("" + x1 + ", " + x2 + ", x3");
	}
	
	//static void printInts(int [] xarr) {
	static void printInts(String prefix, int ... xarr) {
		System.out.print(prefix + " ");
		boolean first = true;
		for(int i : xarr) {
			if(!first)
			{
				System.out.print(", ");
			}
			System.out.print(i);
			first  = false;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printInts(2);
		printInts(2, 54);
		printInts(100, 455, 22);
		printInts("test", 5, 6, 7, 8);
		printInts("test2", 5, 6, 7, 8, 54, 23, 54, 76, 87, 32, 5, 7, 8, 3);
		printInts("test3", new int []{5, 6, 7, 8});
	}
}
