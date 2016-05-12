package common.Aufträge;

import java.awt.Point;

import GUIController.Buttons;
import GUIController.MouseRobot;
import settings.Utils;

public class EnterKoordinaten extends OpenSeachOnMap {

	private Point farm;

	public EnterKoordinaten(int p, Point farm) {
		super(p);
		this.farm = farm;
	}

	@Override
	public void run(MouseRobot robot) {
		super.run(robot);

		if (Buttons.ENTER_X.check()) {
			robot.doubleClick(Buttons.ENTER_X);
			robot.enterKoordinate(farm.x);

		}
		
		robot.wait(Utils.DELAY_TASTENDRUCK);

		if (Buttons.ENTER_Y.check()) {
			robot.doubleClick(Buttons.ENTER_Y);
			robot.enterKoordinate(farm.y);

		}

	}


}
