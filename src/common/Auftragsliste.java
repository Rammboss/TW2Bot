package common;

import java.util.Date;
import java.util.Iterator;
import java.util.PriorityQueue;

import GUIController.MouseRobot;
import common.Aufträge.AuftragInterface;
import settings.Utils;

public class Auftragsliste implements AuftragslisteInterface {

	private PriorityQueue<AuftragInterface> liste;

	private int MAX_AUFTRAEGE;

	public Auftragsliste() {
		liste = new PriorityQueue<AuftragInterface>();
		MAX_AUFTRAEGE = Utils.PRIO_QUEUE_SIZE;
	}

	@Override
	public synchronized boolean isFull() {
		return liste.size() > MAX_AUFTRAEGE - 1;
	}

	@Override
	public synchronized void add(AuftragInterface a) {
		if (!isFull()) {
			MouseRobot.wait(5);
			a.setTime(new Date().getTime());
			liste.add(a);
		}

	}

	@Override
	public synchronized AuftragInterface next() {
		return liste.poll();
	}

	@Override
	public synchronized void clear() {
		liste.clear();
	}

	@Override
	public int size() {
		return liste.size();
	}

	@Override
	public int containsAuftraege(String typ) {
		int counter = 0;
		for(AuftragInterface a : liste){
			if(typ.equals(a.getClass().toString()))
				counter++;
		}
		return counter;
	}
}
