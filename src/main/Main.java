package main;

import java.awt.Point;

import GUIController.GUIController;
import GUIController.MouseRobot;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Auftr�ge.Auftrag;
import common.Auftr�ge.AuftragInterface;
import common.Auftr�ge.EnterKoordinaten;
import settings.Utils;

public class Main {

	public static void main(String[] args) {
		AuftragslisteInterface ai = new Auftragsliste();
		ai.add(new EnterKoordinaten(0, new Point(200, 300)));
		GUIController gc = new GUIController(ai, new MouseRobot(Utils.HWND));
		
		gc.run();
	}

}
