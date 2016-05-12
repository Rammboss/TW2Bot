package GUIController;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import Constants.Settings;
import GUIController.imageHandler.ImageHandler;
import io.Filehandler;
import settings.Utils;

public class Icon implements IconInterface {

	private Rectangle rect;
	private BufferedImage image;
	
	private ImageHandler ih;

	public Icon(Point point, File path) {
		super();
		this.rect = new Rectangle(point.x - Utils.ICON_SIZE, point.y - Utils.ICON_SIZE, Utils.ICON_SIZE * 2,
				Utils.ICON_SIZE * 2);
		this.image = Filehandler.loadImage(path, rect);
		this.ih = new ImageHandler();

	}

	@Override
	public boolean check() {
		BufferedImage br = ih.getScreenshot();
		if(this.equalsAtPosition(br, this.rect)){
			return true;
		}
		return false;
	}
	
	private boolean equalsAtPosition(BufferedImage i, Rectangle r){
		int countEqualPixels = 0;
		int radius = (int)r.getWidth() / 2;
		
		for(int x = 0; x < this.image.getWidth(); x++){
			for(int y = 0; y < this.image.getHeight(); y++){
				if(checkRGB(i.getRGB(x + (int)rect.getX(), y + (int)rect.getY()),
						this.image.getRGB(x, y))){
					countEqualPixels++;
				}
			}
		}
		if(countEqualPixels > Utils.MINDEST_ANZAHL_PIXEL_GLEICH){
			return true;
		}else{
			return false;
		}
		
	}
	private boolean checkRGB(int i, int i2){
		int R1 = Color.decode(i + "").getRed();
		int R2 = Color.decode(i2 + "").getRed();
		int G1 = Color.decode(i + "").getGreen();
		int G2 = Color.decode(i2 + "").getGreen();
		int B1 = Color.decode(i + "").getBlue();
		int B2 = Color.decode(i2 + "").getBlue();
		
//		int abweichung = Math.abs(R1 - R2) + Math.abs(G1-G2) + Math.abs(B1-B2);
		
		int t = Utils.TOLERANZ; //von 255
//		return abweichung < t;
		
		if((R1 >= R2 - t && R1 <= R2 + t)  
				&& (G1 >= G2 - t && G1 <= G2 + t) 
				&& (B1 >= B2 - t && B1 <= B2 + t)){
			return true;
		}
		return false;
	}

	public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
