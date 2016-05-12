package GUIController;

import common.AuftragslisteInterface;
import common.Aufträge.AuftragInterface;
import settings.Utils;

public class GUIController implements Runnable{
	
	private AuftragslisteInterface list;
	private MouseRobot mouseRobot;
	
	
	public GUIController(AuftragslisteInterface list, MouseRobot mouseRobot){
		this.list = list;
		this.mouseRobot = mouseRobot;
	}

	@Override
	public void run() {
		while(Utils.RUNNING){
			AuftragInterface a = list.next();
			if(a != null){
				a.run(mouseRobot);
			}
		}
	}

}
