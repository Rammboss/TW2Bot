package settings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.Advapi32Util.Account;
import com.sun.jna.platform.win32.WinDef.HWND;

import bot.EigenesDorf;
import bot.Rohstofflager;

public class Utils {

	public static final String APP_PLAYER_WINDOW_TITLE = "Tribal Wars 2 (1.55) - Mozilla Firefox";
	public static final String SCREENSHOT_PATH = "Screenshots\\";

	public static final Rohstofflager LAGER = new Rohstofflager(413, 423, "Rohstofflager");
	public static  Iterator<EigenesDorf> ITER = null;
	public static  EigenesDorf CURRENT = null;


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
	public static final int PRIO_QUEUE_SIZE = 1000;
	public static boolean RUNNING = true;

	/**
	 * Prioritäten für Aufträge
	 */
	public static final int PRIO_ANGRIFFDORF = 5;
	public static final int PRIO_CHECKROHSTOFFLAGER = 6;

	public static List<EigenesDorf> DerZurecker = new ArrayList<EigenesDorf>();
	public static List<EigenesDorf> DonPorro = new ArrayList<EigenesDorf>();
	public static List<EigenesDorf> Rammboss = new ArrayList<EigenesDorf>();

	public static final ArrayList<List<EigenesDorf>> ACCOUNTS = new ArrayList<List<EigenesDorf>>();

	static {

		DerZurecker.add(new EigenesDorf(3, 420, 404, "Dorf 001"));
		DerZurecker.add(new EigenesDorf(2, 424, 408, "Dorf 002"));
		DerZurecker.add(new EigenesDorf(3, 418, 403, "Dorf 003"));
		DerZurecker.add(new EigenesDorf(3, 419, 405, "Dorf 004"));
		DerZurecker.add(new EigenesDorf(3, 422, 406, "Dorf 005"));
		DerZurecker.add(new EigenesDorf(2, 422, 407, "Dorf 006"));
		DerZurecker.add(new EigenesDorf(2, 423, 407, "Dorf 007"));
		DerZurecker.add(new EigenesDorf(3, 409, 403, "Dorf 008"));
		DerZurecker.add(new EigenesDorf(3, 415, 403, "Dorf 009"));
		DerZurecker.add(new EigenesDorf(2, 414, 401, "Dorf 010"));
		DerZurecker.add(new EigenesDorf(3, 415, 401, "Dorf 011"));
		DerZurecker.add(new EigenesDorf(3, 414, 402, "Dorf 012"));
		DerZurecker.add(new EigenesDorf(3, 412, 405, "Dorf 013"));
		DerZurecker.add(new EigenesDorf(3, 413, 405, "Dorf 014"));
		DerZurecker.add(new EigenesDorf(3, 426, 404, "Dorf 015"));
		DerZurecker.add(new EigenesDorf(2, 405, 405, "Dorf 016"));
		DerZurecker.add(new EigenesDorf(3, 406, 402, "Dorf 017"));
		DerZurecker.add(new EigenesDorf(3, 406, 403, "Dorf 018"));
		DerZurecker.add(new EigenesDorf(3, 418, 405, "Dorf 019"));
		DerZurecker.add(new EigenesDorf(3, 410, 409, "Mancora"));
		DerZurecker.add(new EigenesDorf(2, 415, 398, "C01"));
		DerZurecker.add(new EigenesDorf(2, 412, 398, "C02"));
		DerZurecker.add(new EigenesDorf(3, 407, 397, "C03"));
		DerZurecker.add(new EigenesDorf(2, 410, 396, "C04"));
		DerZurecker.add(new EigenesDorf(3, 411, 395, "C05"));
		DerZurecker.add(new EigenesDorf(3, 411, 393, "C06"));
		DerZurecker.add(new EigenesDorf(3, 411, 392, "C07"));
		DerZurecker.add(new EigenesDorf(3, 413, 389, "C08"));

		/**
		 * 1 = Axt 2 = lkav 3 = speerträger 4 = berit. Bogen
		 */
		Rammboss.add(new EigenesDorf(1, 413, 421, "001"));
		Rammboss.add(new EigenesDorf(1, 415, 418, "002"));
		Rammboss.add(new EigenesDorf(1, 416, 427, "003"));
		Rammboss.add(new EigenesDorf(4, 415, 429, "004"));
		Rammboss.add(new EigenesDorf(2, 415, 427, "005"));
		Rammboss.add(new EigenesDorf(1, 410, 419, "006"));
		Rammboss.add(new EigenesDorf(3, 414, 416, "007"));
		Rammboss.add(new EigenesDorf(1, 416, 420, "008"));
		Rammboss.add(new EigenesDorf(4, 414, 413, "009"));
		Rammboss.add(new EigenesDorf(3, 417, 428, "010"));
		Rammboss.add(new EigenesDorf(3, 411, 421, "011"));
		Rammboss.add(new EigenesDorf(2, 417, 429, "012"));
		Rammboss.add(new EigenesDorf(3, 415, 421, "013"));
		Rammboss.add(new EigenesDorf(2, 420, 429, "014"));
		Rammboss.add(new EigenesDorf(1, 421, 427, "015"));
		Rammboss.add(new EigenesDorf(1, 419, 429, "016"));
		Rammboss.add(new EigenesDorf(1, 408, 423, "017"));
		Rammboss.add(new EigenesDorf(3, 412, 437, "018"));
		Rammboss.add(new EigenesDorf(1, 420, 428, "019"));
		Rammboss.add(new EigenesDorf(4, 419, 430, "020"));

		DonPorro.add(new EigenesDorf(4, 402, 419, "La Habana"));
		DonPorro.add(new EigenesDorf(3, 397, 422, "Trenidad"));
		DonPorro.add(new EigenesDorf(4, 397, 423, "Santa clara"));
		DonPorro.add(new EigenesDorf(3, 406, 412, "Baracuar"));
		DonPorro.add(new EigenesDorf(4, 411, 410, "Bogota"));
		DonPorro.add(new EigenesDorf(3, 411, 411, "Sanata Marta"));
		DonPorro.add(new EigenesDorf(4, 413, 410, "Taganga"));
		DonPorro.add(new EigenesDorf(4, 415, 410, "Canoa"));
		DonPorro.add(new EigenesDorf(3, 409, 410, "Cali"));
		DonPorro.add(new EigenesDorf(3, 410, 411, "Monta Nita"));

		DonPorro.add(new EigenesDorf(3, 412, 408, "Iquitos"));

		ACCOUNTS.add(Rammboss);
		// ACCOUNTS.add(DerZurecker);
		// ACCOUNTS.add(DonPorro);

	}

}
