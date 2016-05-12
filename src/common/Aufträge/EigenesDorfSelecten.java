package common.Aufträge;

import java.awt.Point;

import GUIController.Buttons;
import GUIController.MouseRobot;

public class EigenesDorfSelecten extends EnterKoordinaten{

	public EigenesDorfSelecten(int p, Point farm) {
		super(p, farm);
	}
	
	public void run(MouseRobot mr){
		super.run(mr);
		if(Buttons.IS_MY_DORF.check()){
			mr.click(Buttons.IS_MY_DORF);
		}else{
			System.out.println("Dorf Wasnt Selected");
			System.out.println("at EigenesDorfSelecten: 16");
		}
	}
	public boolean check() {
		return true;
	}

}
