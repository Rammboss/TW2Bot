package main;
//https://de.forum.tribalwars2.com/index.php?threads/weltdaten-api.2640/

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import GUIController.GUIController;
import GUIController.MouseRobot;
import bot.Babarendorf;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Auftr�ge.AngriffDorf;
import common.Auftr�ge.CheckRohstofflager;
import io.Filehandler;
import settings.Utils;

public class AuftragsHandler implements Runnable {

	private AuftragslisteInterface list;
	ArrayList<Babarendorf> farms;
	Iterator<Babarendorf> iter;

	public AuftragsHandler(AuftragslisteInterface a) {
		this.list = a;
		farms = Filehandler.readData(new File("TXT\\c.txt"));
		iter = farms.iterator();
		Utils.ITER = Utils.CURRENT_ACCOUNT.getListe().iterator();
		Utils.CURRENT = Utils.ITER.next();

	}

//	private void addRohstofflager() {
//		//"class common.Auftr�ge.CheckRohstofflager"
//		if (list.countsAuftraege(CheckRohstofflager.class) < 1
//				&& Utils.LAGER.getChecked() + (7 * 60 * 1000) < new Date().getTime()) {
//
//			list.add(new CheckRohstofflager(Utils.LAGER, false));
//
//		}
//	}

	private void addFarms() {
		Babarendorf baba;
		//"class common.Auftr�ge.AngriffDorf"
		if(list.countsAuftraege(AngriffDorf.class) <= 4){
			if (iter.hasNext()) {
				baba = iter.next();

				if (baba.farmable())
					this.list.add(new AngriffDorf(baba, Utils.CURRENT.getFarmHotkey()));
			}
		}

		

	}

	public AuftragslisteInterface getList() {
		return list;
	}

	public void setList(AuftragslisteInterface list) {
		this.list = list;
	}

	public static void main(String[] args) {
		AuftragslisteInterface list = Auftragsliste.getAuftragsliste();
		MouseRobot robot = new MouseRobot(Utils.HWND);
		GUIController gc = new GUIController(list, robot);
		AuftragsHandler ah = new AuftragsHandler(list);

		new Thread(ah).start();
		new Thread(gc).start();

	}

	@Override
	public void run() {
		while (Utils.RUNNING) {
			//addRohstofflager();
			addFarms();

			MouseRobot.wait(3000);

		}

	}

}
