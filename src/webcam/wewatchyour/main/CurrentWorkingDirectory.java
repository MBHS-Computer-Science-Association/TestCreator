package webcam.wewatchyour.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Stores the user-specified directory for the output of the PDF document
 * 
 * @author Jarod Norwood
 * @author Nicholas Roth
 * 
 */
public class CurrentWorkingDirectory {
	String canPath;
	String absPath;

	public CurrentWorkingDirectory() {
		try {
			FileReader fr = new FileReader(new File("sample.txt"));
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			line = br.readLine();
			br.close();
			File directory = new File(".");
			// System.out.println ("Current directory's canonical path: "
			canPath = directory.getCanonicalPath();
			// System.out.println ("Current directory's absolute path: "
			absPath = directory.getAbsolutePath();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getCanonicalPath() {
		return canPath;
	}

	public String getAbsolutePath() {
		return absPath;
	}
}
