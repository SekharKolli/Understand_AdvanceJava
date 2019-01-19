/**
 * Purpose : demonstrates the use of enum browser
*
* Date: 31-December-2018
*/


package sk.understand.enums;

public class BrowserUser {

	public static void main(String[] args) {
		
		Browser b = Browser.CHROME;
		
		System.out.println("priting the value of b : "+b);

		Browser[] listOfVal = Browser.values();
		
		for (Browser browser : listOfVal) {
			System.out.println(browser);
		}


	}

}
