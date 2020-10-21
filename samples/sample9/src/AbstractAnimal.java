
// Java abstract class is like C++ class with pure-virtual methods

/* C++ same class:
 * 
 * class AbtractAnimal {
 * public:
 *   AbstractAnimal(const std::string & _name) : name = _name {}
 *   std::string getName() const {
 *     return this->name;
 *   }
 *   void setName(const std::string & name) {
 *     this->name = name;
 *   }
 *   
 *   virtual void saySomethig() = 0; // Pure-virtual function
 *   
 * private:
 *   std::string name;
 * };
 *
 */

public abstract class AbstractAnimal {
	
	public AbstractAnimal(String name) {
		this.name = name;
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void saySomething();
}

