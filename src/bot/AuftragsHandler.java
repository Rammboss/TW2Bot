package bot;

import GUIController.GUIController;
import GUIController.MouseRobot;
import bot.factories.BabaFarmFactory;
import bot.factories.RostofflagerFactory;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Aufträge.ChangeMyVillage;
import settings.Utils;

public class AuftragsHandler implements Runnable{

	@Override
	public void run() {
		Auftragsliste liste = Auftragsliste.getAuftragsliste();
		liste.add(new ChangeMyVillage(100, Utils.CURRENT));
		BabaFarmFactory bff = BabaFarmFactory.getBabafactory(liste);
		RostofflagerFactory rlf = RostofflagerFactory.getRohstofflagerFactory(liste);
		while(Utils.RUNNING){
			rlf.check();
			bff.check();
			MouseRobot.wait(5000);
		}
		
	}
	
	public static void main(String[] args) {
		AuftragslisteInterface list = Auftragsliste.getAuftragsliste();
		MouseRobot robot = new MouseRobot(Utils.HWND);
		GUIController gc = new GUIController(list, robot);
		AuftragsHandler ah = new AuftragsHandler();

		new Thread(ah).start();
		new Thread(gc).start();
	}

}
