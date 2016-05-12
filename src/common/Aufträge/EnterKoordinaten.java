package common.Aufträge;

import GUIController.Buttons;
import GUIController.MouseRobot;

public class EnterKoordinaten extends OpenSeachOnMap {

	public EnterKoordinaten(int p) {
		super(p);
	}

	@Override
	public void run(MouseRobot robot) {
		super.run(robot);
		
		if(Buttons.ENTER_X.check()){
			
		}

	}

}
