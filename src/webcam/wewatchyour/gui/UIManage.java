package webcam.wewatchyour.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.locks.Lock;

public class UIManage implements Runnable{
	private MainApp gui;
	private boolean shouldHold = true;
	private Lock lock;
	String[] args;
	
	public UIManage(Lock lock, String[] args){
		this.lock = lock;
		this.args = args;
		init(args);
	}
	
	
	private void init(String[] args){

		gui = new MainApp(args);
	}

	@Override
	public void run() {
	}
}
