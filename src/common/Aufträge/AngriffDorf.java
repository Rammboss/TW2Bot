package common.Aufträge;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.Barbarendorf;
import bot.Dorf;
import bot.Spielerdorf;

public class AngriffDorf extends EnterKoordinaten {

	private int hotkey;
	private Dorf farm;

	public AngriffDorf(int p, Dorf farm, int hotkey, String art) {
		super(p, farm.getPosition());
		this.hotkey = hotkey;
		this.farm = farm;

	}

	public void run(MouseRobot robot) {
		super.run(robot);
		if (checkDorf()) {
			robot.enterKoordinate(hotkey);
		}
	}

	private boolean checkDorf() {
		if (farm instanceof Barbarendorf) {
			return Buttons.CHECKBARBARENDORF.check();

		} else if (farm instanceof Spielerdorf) {
			// Muss noch implementiert werden für Spieler
			return false;
		}
		return false;

	}

}
