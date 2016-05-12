package common;

import java.util.PriorityQueue;

import common.Aufträge.Auftrag;

public class Auftragsliste implements AuftagslisteInterface{
	
	private PriorityQueue<AuftragInterface> liste;
	
	private final int MAX_AUFTRAEGE = 100;

	@Override
	public boolean isFull() {
		return liste.size() > MAX_AUFTRAEGE;
	}

	@Override
	public void add(AuftragInterface a) {
		liste.add(a);
	}

	@Override
	public AuftragInterface next() {
		return liste.peek();
	}

}
