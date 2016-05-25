package common.Aufträge;


import java.util.Date;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.Babarendorf;
import bot.Gegnerdorf;

public class AngriffDorf extends CheckError {

	private int hotkey;
	private Gegnerdorf farm;

	public AngriffDorf(int p, Gegnerdorf farm, int hotkey) {
		super(p, farm.getPosition());
		this.hotkey = hotkey;
		this.farm = farm;

	}

	public void run(MouseRobot robot) {
		super.run(robot);
		if (checkDorf()) {
			robot.enterKoordinate(hotkey);
			Date d = new Date();
			farm.setLetzterAngriff(d.getTime());
		}
	}

	private boolean checkDorf() {
		if (farm instanceof Babarendorf) {
			System.out.println(Buttons.CHECKBARBARENDORF.check());
			return Buttons.CHECKBARBARENDORF.check();
			

		} else if (farm instanceof Gegnerdorf) {
			// Muss noch implementiert werden für Spieler
			return false;
		}
		return false;

	}

}
