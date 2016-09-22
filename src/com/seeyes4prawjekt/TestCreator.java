package com.seeyes4prawjekt;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestCreator {
	String pdfName;
	
	public static void main(String[] args){
		String[] authors = {"Jarod Norwood", "Nicholas Roth"};
		TestCreator program = new TestCreator(authors);
	}

	public TestCreator(String[] authors){
		System.out.println("Thank you for using TestCreator! This product was brought to you by " + authors[0] + " and " + authors[1] + "Please understand that this is not a finished build and we at seeyes4prawjekt are always working to improve your experience! Have a nice day!");
		Lock l = new ReentrantLock();

		TexWriter texWriter = new TexWriter(l);
		Thread texMaker = new Thread(texWriter);
		texMaker.start();

		pdfName = "quiz1PDF";
		PDFWriter pdfWriter = new PDFWriter(pdfName, l);
		Thread pdfMaker = new Thread(pdfWriter);
		pdfMaker.start();

	}

}
