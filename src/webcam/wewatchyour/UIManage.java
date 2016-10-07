package webcam.wewatchyour;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class UIManage implements Runnable {

	public UIManage() {

	}

	public void run() {
		OpenScreen lander = new OpenScreen();
	}
	
	//make non static ASAP
	public static Image resizeImgIcon(ImageIcon srcImgIcon, int w, int h) {
		Image srcImg = srcImgIcon.getImage();
		BufferedImage resizedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImage.createGraphics();
		// interpolation method may chnage
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();
		return resizedImage;
	}

}
