package common.Aufträge;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.EigenesDorf;
import bot.factories.BabaFarmFactory;

public class ChangeMyVillage extends EnterKoordinaten {

	public ChangeMyVillage(int p, EigenesDorf dorf) {
		super(p, dorf.getPosition());
	}

	public void run(MouseRobot robot) {
		super.run(robot);	
		if (Buttons.CHANGE_CURRENT_VILLAGE.IsActive(5000)) {
			robot.click(Buttons.CHANGE_CURRENT_VILLAGE);
		}
		
		BabaFarmFactory.sortFarms();

	}

}
