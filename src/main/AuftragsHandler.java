package main;
//https://de.forum.tribalwars2.com/index.php?threads/weltdaten-api.2640/

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import GUIController.GUIController;
import GUIController.MouseRobot;
import bot.Babarendorf;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Aufträge.AngriffDorf;
import common.Aufträge.CheckRohstofflager;
import io.Filehandler;
import settings.Utils;

public class AuftragsHandler implements Runnable {

	private AuftragslisteInterface list;
	private GUIController gc;

	public AuftragsHandler(AuftragslisteInterface a, GUIController b) {
		this.list = a;
		this.gc = b;

	}

	@Override
	public void run() {
		while (Utils.RUNNING) {

			addFarms();
			addRohstofflager();

			MouseRobot.wait(10000);

		}

	}

	private void addRohstofflager() {

		if (Utils.LAGER.getChecked() + (7 * 60 * 1000) < new Date().getTime())
			this.list.add(new CheckRohstofflager(2, Utils.LAGER.getPosition(), false));

	}

	private void addFarms() {

		ArrayList<Babarendorf> list = Filehandler.readData(new File("TXT\\c.txt"));

		for (Babarendorf d : list) {
			if (d.farmable())
				this.list.add(new AngriffDorf(Utils.ANGRIFFDORF, d, 3));
		}

	}

	public AuftragslisteInterface getList() {
		return list;
	}

	public void setList(AuftragslisteInterface list) {
		this.list = list;
	}

	public GUIController getGc() {
		return gc;
	}

	public void setGc(GUIController gc) {
		this.gc = gc;
	}

	public static void main(String[] args) {
		AuftragslisteInterface list = new Auftragsliste();
		MouseRobot robot = new MouseRobot(Utils.HWND);
		GUIController gc = new GUIController(list, robot);
		AuftragsHandler ah = new AuftragsHandler(list, gc);

		new Thread(ah).start();
		new Thread(gc).start();

	}

}
