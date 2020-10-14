class Box {

//	void value() {
//		System.out.println("value=" + (width * height * length));
//	}
	
	// Box() {...}
	
	Box(double width, double height, double length) {
		System.out.println("Box constructor called");
		this.width = width;
		this.height = height;
		this.length = length;
		
		// So 'this' is a reference to current object instance
		// Difference from C++: in C++ 'this' is a 'pointer', not a 'reference' (this->ccc)
	}
	
	Box() {
		// Can call another constructor here (at very first line of my constructor)
		this(0, 0, 0);
//		width = 0;
//		height = 0;
//		length = 0;
	}
	
	double value() {
		return width * height * length;
	}

	// NOT WORKING
//	int value() {
//		return (int) (width * height * length);
//	}	
	
	void setDimensions(double x) {
		width = x;
		height = x;
		length = x;
	}
	
	void setDimensions(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}
	
	void setDimensions(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
	}
	
	Box createCopy() {
//		Box copy = new Box();
//		copy.width = this.width;
//		copy.height = this.height;
//		copy.length = this.length;
//		return copy;
		return new Box(width, height, length);
	}
	
	double width;
	double height;
	double length;
}
