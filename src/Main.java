/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton.getInstance();
		
		//line below is incorrect, because constructor form Singleton class is not visible
		//Singleton test = new Singleton();
		//test.getInstance;
	}

}
