/**
 * Multiline comment
 */
package myPackage;
import java.util.Random;
/**
 * This class represents the bat in the program
 * Which behaves randomly
 * 
 * @author Kaleb
 * @version 2/4/2019
 */
public class Bat extends AbstractCritter {

	/**
	 * This is the constructor which
	 * Calls the super constructor and 
	 * Passes it a char.
	 */
	public Bat() {
		super('B');
	}

	/**
	 * This is the overridden method from the 
	 * Interface which should return a random
	 * Direction up to, but not including CENTER.
	 */
	@Override
	public int getMove(CritterInfo theInfo) {
		return new Random().nextInt(CENTER);
	}

	
}
