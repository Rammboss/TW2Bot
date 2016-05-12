package common;

import common.Aufträge.AuftragInterface;

public interface AuftragslisteInterface {
	public boolean isFull();

	public void add(AuftragInterface a);

	public AuftragInterface next();
	
	public void clear();
}
