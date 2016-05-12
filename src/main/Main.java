package main;

import java.awt.Point;

import GUIController.GUIController;
import GUIController.MouseRobot;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Aufträge.Auftrag;
import common.Aufträge.AuftragInterface;
import common.Aufträge.EnterKoordinaten;
import settings.Utils;

public class Main {

	public static void main(String[] args) {
		AuftragslisteInterface ai = new Auftragsliste();
		ai.add(new EnterKoordinaten(0, new Point(200, 300)));
		GUIController gc = new GUIController(ai, new MouseRobot(Utils.HWND));
		
		gc.run();
	}

}
