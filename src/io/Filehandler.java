package io;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.imageio.ImageIO;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import com.sun.prism.Image;

import GUIController.Icon;
import GUIController.Screenshots;

public class Filehandler {
	/**
	 * LoadImage lädt den Screenshot, schneidet das Bild aus und gibt das Icon
	 * zurueck.
	 * 
	 * @param path
	 *            - Der Screenshot
	 * @param rect
	 *            - Der auszuschneidende Bereich
	 * @return - Das ausgeschnittene Icon
	 */
	public static BufferedImage loadImage(File path, Rectangle rect) {
		// Keine Referenz auf Screenshot behalten

		BufferedImage screenshot = load(path);

		BufferedImage icon = screenshot.getSubimage(rect.x, rect.y, rect.width, rect.height);

		saveIcon(icon);

		return icon;
	}

	private static void saveIcon(BufferedImage icon) {
		
		try {
			ImageIO.write(icon, "png", new File("C:\\Temp\\x.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static BufferedImage load(File path) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(path);
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}

		return image;
	}

	public static void main(String[] args) {
		Icon test = new Icon(new Point(127,718), Screenshots.s1);
		

	}

}
