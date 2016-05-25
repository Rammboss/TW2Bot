package common.Aufträge;

import java.awt.Point;

import GUIController.Buttons;
import GUIController.MouseRobot;
import bot.Dorf;

public class CheckRohstofflager extends EnterKoordinaten {

	private Dorf rohstofflager;
	private boolean item;

	public CheckRohstofflager(int p, Point farm, boolean item) {
		super(p, farm);
		this.item = item;
	}

	@Override
	public void run(MouseRobot robot) {
		super.run(robot);

		if (item) {
			robot.click(510, 416);
			MouseRobot.wait(1000);// Mitte des Bildschirms
			robot.click(510, 416);

			while (true) {
				MouseRobot.wait(1000);
				robot.click(Buttons.ROHSTOFFLAGER_COLLECT);
				MouseRobot.wait(1000);
				if (!Buttons.ROHSTOFFLAGER_START.check()) {

					robot.click(Buttons.USEITEM);
					MouseRobot.wait(2000);

					robot.click(Buttons.USEGEGENSTAND);
					MouseRobot.wait(2000);

				} else {
					robot.click(Buttons.ROHSTOFFLAGER_START);
				}
				MouseRobot.wait(10000);
			}

		} else {

			robot.click(510, 416);
			MouseRobot.wait(1000);// Mitte des Bildschirms
			robot.click(510, 416);

			MouseRobot.wait(1000);
			robot.click(Buttons.ROHSTOFFLAGER_COLLECT);
			MouseRobot.wait(1000);
			robot.click(Buttons.ROHSTOFFLAGER_START);
			robot.click(Buttons.CLOSE);
		}

	}

	public Dorf getRohstofflager() {
		return rohstofflager;
	}

	public void setRohstofflager(Dorf rohstofflager) {
		this.rohstofflager = rohstofflager;
	}

}
