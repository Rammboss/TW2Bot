package main;

import java.awt.Point;

import GUIController.GUIController;
import GUIController.MouseRobot;
import bot.Babarendorf;
import common.Auftragsliste;
import common.AuftragslisteInterface;
import common.Aufträge.AngriffDorf;
import common.Aufträge.Auftrag;
import common.Aufträge.AuftragInterface;
import common.Aufträge.EnterKoordinaten;
import settings.Utils;

public class Main {

	public static void main(String[] args) {
		AuftragslisteInterface ai = new Auftragsliste();
		ai.add(new EnterKoordinaten(0, new Point(418, 405)));
		ai.add(new EnterKoordinaten(0, new Point(419, 405)));
		ai.add(new EnterKoordinaten(0, new Point(420, 405)));
		ai.add(new EnterKoordinaten(0, new Point(418, 405)));
		ai.add(new EnterKoordinaten(0, new Point(419, 405)));
		ai.add(new EnterKoordinaten(0, new Point(420, 405)));
		ai.add(new EnterKoordinaten(0, new Point(418, 405)));
		ai.add(new EnterKoordinaten(0, new Point(419, 405)));
		ai.add(new EnterKoordinaten(0, new Point(420, 405)));
		ai.add(new AngriffDorf(1, new Babarendorf(422, 404), 3));
		GUIController gc = new GUIController(ai, new MouseRobot(Utils.HWND));
		
		gc.run();
	}

}
