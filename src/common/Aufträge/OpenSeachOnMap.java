package common.Auftr�ge;

import GUIController.Buttons;
import GUIController.MouseRobot;

public class OpenSeachOnMap extends Auftrag {

	public OpenSeachOnMap(int p) {
		super(p);
	}

	@Override
	public void run(MouseRobot robot) {
		if (!Buttons.ENTER_X.check())
			robot.click(Buttons.SEARCH_ON_MAP);
		Buttons.SEARCH_ON_MAP.IsActive(1000);
	}

	@Override
	public boolean check() {
		return Buttons.ENTER_X.check();
	}

}
