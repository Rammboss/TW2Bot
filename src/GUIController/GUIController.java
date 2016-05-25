package GUIController;

import common.AuftragslisteInterface;
import common.Aufträge.AuftragInterface;
import main.AuftragsHandler;
import settings.Utils;

public class GUIController implements Runnable {

	private AuftragslisteInterface list;
	private MouseRobot mouseRobot;

	public GUIController(AuftragslisteInterface list, MouseRobot mouseRobot) {
		this.list = list;
		this.mouseRobot = mouseRobot;
	}

	@Override
	public void run() {
		while (Utils.RUNNING) {
			AuftragInterface a = list.next();
		
			if (a != null) {
				a.run(mouseRobot);
				if (!a.check()) { // falls Aufrtag nicht erfüllt wurde
					a.setPriority(a.getPriority() + 1);
					list.add(a);
				}

			}if(list.size() < 5 ){
				new AuftragsHandler(list, this).run();
			}
			System.out.println("Anzahl der Elemente:" + list.size());
		}
	}

}
