/**
 * Purpose : Demos an example where ENUMS can be assigned specific values
 * More Examples Here : http://www.ntu.edu.sg/home/ehchua/programming/java/javaenum.html
 *
 * Date: 31-December-2018
 */

package sk.understand.enums;

enum TrafficLight {
	RED(30), AMBER(10), GREEN(30); // Named constants with values

	private final int seconds; // Private variable

	TrafficLight(int seconds) { // constructor
		this.seconds = seconds;
	}

	int getSeconds() { // Getter
		return seconds;
	}
}

public class TrafficLightTestWithENUMs {

	public static void main(String[] args) {
		for (TrafficLight light : TrafficLight.values()) {
			System.out.printf("%s: %d seconds\n", light, light.getSeconds());
		}

	}

}
