package common;

import java.util.Date;
import java.util.PriorityQueue;

import GUIController.MouseRobot;
import common.Auftr�ge.AuftragInterface;
import settings.Utils;

public class Auftragsliste implements AuftragslisteInterface{
	
	private PriorityQueue<AuftragInterface> liste;
	
	private int MAX_AUFTRAEGE;
	
	public Auftragsliste() {
		liste = new PriorityQueue<AuftragInterface>();
		MAX_AUFTRAEGE = Utils.PRIO_QUEUE_SIZE;
	}
	
	@Override
	public synchronized boolean isFull() {
		return liste.size() > MAX_AUFTRAEGE;
	}

	@Override
	public synchronized void add(AuftragInterface a) {
		MouseRobot.wait(5);
		a.setTime(new Date().getTime());
		liste.add(a);
	}

	@Override
	public synchronized AuftragInterface next() {
		return liste.poll();
	}

	@Override
	public synchronized void clear() {
		liste.clear();	
	}
}
