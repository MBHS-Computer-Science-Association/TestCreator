package com.seeyes4prawjekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.locks.Lock;
/**
 * The TexWriter Thread works to fill the temporary .tex file so that PDFWriter can convert it into a PDF document
 * @author Jarod Norwood
 *
 */
public class TexWriter implements Runnable {

	private String dir;
	private String name;
	@SuppressWarnings("unused")
	private String contents;
	private Lock l;
	private CurrentWorkingDirectory path;
	private PrintStream o;
	
	/**
	 * Instantiates the 
	 * @param l - the semaphore for restricting access to the temporary .tex file
	 * @param path - Current Directory selected by the user
	 * @param name - name of the quiz 
	 */
	public TexWriter(Lock l, CurrentWorkingDirectory path, String name) {
		this.name = name;
		this.l = l;
		this.path = path;
	}
	/**
	 * converts single backslashes into doubles
	 * @deprecated
	 * @param str input string
	 * @return
	 */
	public static String javanize(String str) {
		String out = "";
		int val = str.length();
		for (int i = 0; i < val; i++) {
			if (str.charAt(i) == '\\') {
				out = out + '\\' + '\\';
			} else {
				out = out + str.charAt(i);
			}
		}
		return out;
	}
	/**
	 * Initialization once TestCreator has created the TexWriter Thread
	 */
	public void run() {
		try {
			l.lock();
			dir = path.getCanonicalPath();
			writeToFile();
			makeContents();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			l.unlock();
		}
	}
	/**
	 * Creates the contents of the temporary .tex file
	 * @throws IOException
	 */
	public void makeContents() throws IOException {
		FileReader fr = new FileReader(new File("sample.txt"));
//		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null){
			o.println(line);
		}
		br.close();
	}
	/**
	 * creates the PrintStream for outputting to the temporary .tex file 
	 * @throws FileNotFoundException
	 */
	public void writeToFile() throws FileNotFoundException {
		File output = new File(dir, name + ".tex");
		o = new PrintStream(output);
//		o.println(contents);
//		o.close();
	}
	/**
	 * 
	 * @return name of the PDF/.tex file
	 */
	public String getName() {
		return name;
	}

}
