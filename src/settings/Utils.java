package settings;

import java.io.File;

import com.sun.javafx.iio.common.RoughScaler;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;

import bot.Dorf;
import bot.Rohstofflager;


public class Utils {
	
	public static final String APP_PLAYER_WINDOW_TITLE = "Tribal Wars 2 (1.55) - Mozilla Firefox";
	public static final String SCREENSHOT_PATH = "Screenshots\\";
	
	public static final Rohstofflager LAGER = new Rohstofflager(413, 423, "Rohstofflager");
	
	
	
	public static final int ICON_SIZE = 10;
	
	public static final int DELAY_TASTENDRUCK = 100;
	
	public static final HWND HWND = User32.INSTANCE.FindWindow(null, APP_PLAYER_WINDOW_TITLE);
	
	
	/**
	 * Für Klasse Icon
	 */
	public static final int MINDEST_ANZAHL_PIXEL_GLEICH = 95;
	
	/**
	 * Für Klasse Icon
	 */
	public static final int TOLERANZ = 5;
	public static final int PRIO_QUEUE_SIZE = 100;
	public static boolean RUNNING = true;
	
	/**
	 * Prioritäten für Aufträge
	 */
	public static int ANGRIFFDORF = 5;


}
