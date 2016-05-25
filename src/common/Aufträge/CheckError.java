package common.Aufträge;

import java.awt.Point;

import GUIController.Buttons;
import GUIController.MouseRobot;
import settings.Utils;

public class CheckError extends EnterKoordinaten {

	public CheckError(int p, Point farm) {
		super(p, farm);
	}

	public void run(MouseRobot robot) {
		super.run(robot);

		if (Buttons.ERROR.check()) {

			if (Utils.ITER.hasNext()) {
				Utils.CURRENT = Utils.ITER.next();

				new ChangeMyVillage(1, Utils.CURRENT).run(robot);

			} else {
				Utils.ITER = Utils.ACCOUNTS.get(0).iterator();
				Utils.CURRENT = Utils.ITER.next();
			}

		}

	}

}
