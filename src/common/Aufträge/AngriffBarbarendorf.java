package common.Aufträge;

import java.awt.Point;

import GUIController.Buttons;
import GUIController.MouseRobot;

public class AngriffBarbarendorf extends EnterKoordinaten {

	private int hotkey;

	public AngriffBarbarendorf(int p, Point farm, int hotkey) {
		super(p, farm);
		this.hotkey = hotkey;

	}

	public void run(MouseRobot robot) {
		super.run(robot);
		if (checkBarbarenDorf()) {

		}
	}

	private boolean checkBarbarenDorf() {
		return Buttons.CHECKBARBARENDORF.check();
	}

}
