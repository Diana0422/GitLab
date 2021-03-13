import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		Logger.getGlobal().log(Level.INFO, "Starting main...");
		System.out.println("Hello World!");
		System.out.println("Shutting main...");
	}
}
