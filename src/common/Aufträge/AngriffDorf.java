package common.Auftr�ge;


import java.util.Date;

import GUIController.Buttons;
import GUIController.GUIController;
import GUIController.MouseRobot;
import bot.Babarendorf;
import bot.Gegnerdorf;

public class AngriffDorf extends CheckError {

	private int hotkey;
	private Gegnerdorf farm;
	
	public static final int PRIO_ANGRIFFDORF = 5;

	public AngriffDorf(Gegnerdorf farm, int hotkey) {
		super(PRIO_ANGRIFFDORF, farm.getPosition());
		this.hotkey = hotkey;
		this.farm = farm;
	}

	public void run(MouseRobot robot) {
		super.run(robot);
		if (checkDorf()) {
			robot.enterKoordinate(getHotkey());
			Date d = new Date();
			farm.setLetzterAngriff(d.getTime());
		}
	}
	
	private int getHotkey(){
		if(!Buttons.SPEER_0.check()){
			System.out.println("SPEER Verf�gbar");
			return 1;
		}
		else if(!Buttons.SCHWERT_0.check()){
			System.out.println("SCHWERT Verf�gbar");
			return 2;
		}
		else if(!Buttons.AXT_0.check()){
			System.out.println("AXT Verf�gbar");
			return 3;
		}
		else if(!Buttons.BOGEN_0.check()){
			System.out.println("BOGEN Verf�gbar");
			return 4;
		}
		else if(!Buttons.LKAV_0.check()){
			System.out.println("LKAV Verf�gbar");
			return 5;
		}
		else if(!Buttons.BERITTENE_BOGEN_0.check()){
			System.out.println("Berittene Bogen Verf�gbar");
			return 6;
		}
		else if(!Buttons.SKAV_0.check()){
			System.out.println("SKAV Verf�gbar");
			return 7;
		}
		else {
			System.out.println("Keine Einheiten Verf�gbar");
			return 7;
		}
	}
	
	public boolean check() {
		return true;
	}

	private boolean checkDorf() {
		if (farm instanceof Babarendorf) {
			System.out.println(Buttons.CHECKBARBARENDORF.check());
			return Buttons.CHECKBARBARENDORF.check();
			

		} else if (farm instanceof Gegnerdorf) {
			// Muss noch implementiert werden f�r Spieler
			return false;
		}
		return false;

	}

}
