package webcam.wewatchyour.main;

import java.io.File;

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
		File directory = new File(".");
		try {
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
