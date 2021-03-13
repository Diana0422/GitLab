import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		Logger.getGlobal().log(Level.INFO, "Starting main...");
		Logger.getGlobal().log(Level.INFO, "Hello World!");
		Logger.getGlobal().log(Level.INFO, "Shutting main...");
	}
}
