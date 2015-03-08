/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;
	
	//default constructor, which blocks creating many instance of Singleton's object
	private Singleton() {
		
	}
	  
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		System.out.println("This is unique instance of Singleton.");
		return uniqueInstance;
	}
}
