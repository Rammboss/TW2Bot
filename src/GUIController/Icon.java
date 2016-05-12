package GUIController;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import io.Filehandler;
import settings.Utils;

public class Icon implements IconInterface {

	private Rectangle rect;
	private BufferedImage image;

	public Icon(Point point, File path) {
		super();
		this.rect = new Rectangle(point.x - Utils.ICON_SIZE, point.y - Utils.ICON_SIZE, Utils.ICON_SIZE * 2,
				Utils.ICON_SIZE * 2);
		this.image = Filehandler.loadImage(path, rect);

	}

	@Override
	public boolean check() {
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
