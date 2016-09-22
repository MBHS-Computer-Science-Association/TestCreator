package com.seeyes4prawjekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.locks.Lock;

public class TexWriter implements Runnable {

	private String dir;
	private String name;
	@SuppressWarnings("unused")
	private String contents;
	private Lock l;
	private CurrentWorkingDirectory path;
	private PrintStream o;

	public TexWriter(Lock l, CurrentWorkingDirectory path, String name) {
		this.name = name;
		this.l = l;
		this.path = path;
	}

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

	public void writeToFile() throws FileNotFoundException {
		File output = new File(dir, name + ".tex");
		o = new PrintStream(output);
//		o.println(contents);
//		o.close();
	}

	public String getName() {
		return name;
	}

}
