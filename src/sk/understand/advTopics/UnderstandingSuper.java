/**
 * Purpose : To demo the usage of super keyword and this keyword. also demo a
 * case where if we miss the super keyword, we'll have an infinite recursion
 *
 * Date: 31-December-2018
 */

package sk.understand.advTopics;

class UseElectricity {

	boolean mainElectricSwitch;

	public UseElectricity() {
		mainElectricSwitch = true;
	}

	void reset() {
		System.out.println("Turned Main Switch OFF...");
		mainElectricSwitch = false;
		System.out.println("Turned Main Switch ON...");
		mainElectricSwitch = true;
	}
} // EO SwitchBoard

class Stove extends UseElectricity {
	
	boolean stoveSwitch;

	public Stove() {
		this(true); // using the 'this' to make a call to the constructor with the parameter.  
	}
	
	public Stove(boolean stoveSwitch) {
		super(); // One way to use the super keyword. this calls the constructor of the super class
		this.stoveSwitch = stoveSwitch;
	}
	
	@Override
	void reset() { // resetting the stove requires us to reset mainElecticSwitch
		
		System.out.println("Resetting the main switch...");
//		 reset(); // *** Simply putting this line will generate a infinite recursion finally throwing a stack overflow exception
		super.reset(); // Using the super keyword to call the reset method from the super class, or else there is no way to call it 

		System.out.println("Turning Stove Switch OFF...");
		this.stoveSwitch = false;
		
		System.out.println("Turning Stove Switch ON...");
		this.stoveSwitch = true;
	}

} // EO Stove

public class UnderstandingSuper {

	public static void main(String[] args) {

		Stove s = new Stove();
		s.reset();
		
	}

}
