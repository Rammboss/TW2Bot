package common.Aufträge;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.EigenesDorf;

public class ChangeMyVillage extends EnterKoordinaten {

	public ChangeMyVillage(int p, EigenesDorf farm) {
		super(p, farm.getPosition());
	}

	public void run(MouseRobot robot) {
		super.run(robot);
		Buttons.CHANGE_CURRENT_VILLAGE.IsActive(5000);
		if (Buttons.CHANGE_CURRENT_VILLAGE.check()) {

			robot.click(Buttons.CHANGE_CURRENT_VILLAGE);
		}

	}

}
