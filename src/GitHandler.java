import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GitHandler {

	public static void main(String[] args) {
		Logger.getGlobal().log(Level.INFO, "Starting main...");
		Logger.getGlobal().log(Level.INFO, "Hello World!");
		Runtime rt = Runtime.getRuntime();
		String command = "git log --grep=\"added\"";
		try {
			Process p = rt.exec(command);
			printOnScreen(command, p);
			p.waitFor();
			String infoProc = "Running process: "+p.toString();
			Logger.getGlobal().log(Level.INFO, infoProc);
			Logger.getGlobal().log(Level.INFO, "Shutting main...");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
	
	public static void printOnScreen(String command, Process inputProcess) {
        BufferedReader input = new BufferedReader(new InputStreamReader(inputProcess.getInputStream()));
        String line = null;
        System.out.println(">\n>\n");
        System.out.println(command);
        System.out.println("\n>\n>\n");
        System.out.println(">********* COMMIT IDS *********");
        try {
            while ((line = input.readLine()) != null)
            	if (line.contains("commit")) {
            		System.out.println();
                    System.out.println(line.substring(7));
            	}
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
