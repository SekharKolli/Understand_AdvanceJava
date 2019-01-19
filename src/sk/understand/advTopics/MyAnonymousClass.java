/**
 * Purpose : declare and demo the usage of an anonymous class
 *
 * Date: 30-December-2018
 */

package sk.understand.advTopics;

interface Shopping {
	void makeList();
	void visitShop();
	void payAndPack();
}

public class MyAnonymousClass {

	public static void main(String[] args) {

		// An interface cannot be instantiated. Only a class can be
		Shopping boxingDay = new Shopping() { // an anonymous class is being ?? implemented and ?? instantiated

			@Override
			public void visitShop() { System.out.println("Pull the car and lets drive to Guess at Mid-Night!"); }

			@Override
			public void payAndPack() { System.out.println("here is my card and get that free gift!"); }

			@Override
			public void makeList() { System.out.println("My list contains... 1\\ jeans & 2\\ jacket"); }
		}; // EO Anonymous Class

		boxingDay.makeList();
		boxingDay.visitShop();
		boxingDay.payAndPack();
		
	}

}
