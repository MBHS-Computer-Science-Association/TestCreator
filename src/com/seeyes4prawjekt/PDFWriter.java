package com.seeyes4prawjekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;

public class PDFWriter implements Runnable {

	private File dir;
	private String name;
	private Lock l;
	private CurrentWorkingDirectory path;
	
	public PDFWriter(String name, Lock l, CurrentWorkingDirectory path) {
		this.name = name;
		this.l = l;
		this.path = path;
	}

	public void run() {
		try {
			l.lock();
			dir = new File(path.getCanonicalPath());
			savePDF();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			l.unlock();
		}
	}

	public void savePDF() throws IOException {

		Runtime runtime = Runtime.getRuntime();
		String[] args = { "pdflatex", " temp.tex" };
		Process process = runtime.exec(args, null, dir);

		// Process process = new ProcessBuilder(args).start();

		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line = null;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}
