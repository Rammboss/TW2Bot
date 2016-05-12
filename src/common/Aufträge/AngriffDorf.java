package common.Aufträge;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.Babarendorf;
import bot.Dorf;
import bot.Spielerdorf;

public class AngriffDorf extends EnterKoordinaten {

	private int hotkey;
	private Dorf farm;

	public AngriffDorf(int p, Dorf farm, int hotkey) {
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
		System.out.println("hi");
		if (farm instanceof Babarendorf) {
			System.out.println(Buttons.CHECKBARBARENDORF.check());
			return Buttons.CHECKBARBARENDORF.check();
			

		} else if (farm instanceof Spielerdorf) {
			// Muss noch implementiert werden für Spieler
			return false;
		}
		return false;

	}

}
