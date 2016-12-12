package webcam.wewatchyour.gui;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UIManage {
	private ReentrantLock lock;
	private MainApp gui;
	
	public UIManage(ReentrantLock lock, String[] args){
		this.lock = lock;
		init(args);
	}
	
	private void init(String[] args){
		lock.lock();
		gui = new MainApp(lock, args);
	}
}
