package common;

import common.Auftr�ge.AuftragInterface;

public interface AuftragslisteInterface {
	public boolean isFull();

	public void add(AuftragInterface a);

	public AuftragInterface next();
	
	public void clear();
}
