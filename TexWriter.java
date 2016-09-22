package com.seeyes4prawjekt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.locks.Lock;

public class TexWriter implements Runnable{

	private String dir;
	private String name;
	private String contents;
	private Lock l;

	public TexWriter(Lock l) {
		name = "temp";
		this.l = l;
	}

	public void run() {
		try {
			l.lock();
			CurrentWorkingDirectory pathFinder = new CurrentWorkingDirectory();
			dir = pathFinder.getCanonicalPath();
			makeContents();
			writeToFile();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			l.unlock();
		}
	}

	public void makeContents(){
		contents = "\\documentclass{article}" + '\n' + "\\title{First Quarter Objectives}" + '\n'
				+ "\\date{8/31/2016}" + '\n' + "\\author{ Jarod Norwood \\and Nicholas Roth}" + '\n' +

				"\\begin{document}" + '\n' + "	\\maketitle" + '\n' + "\\end{document}";
	}

	

	public void writeToFile() throws FileNotFoundException {
		File output = new File(dir, name + ".tex");
		PrintStream o = new PrintStream(output);
		o.println(contents);
	}
	
	public String getName(){
		return name;
	}

}
