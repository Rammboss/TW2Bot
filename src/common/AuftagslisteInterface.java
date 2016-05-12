package common;

public interface AuftagslisteInterface {

	public boolean isFull();

	public void add(AuftragInterface a);

	public AuftragInterface next();
	
	public void clear();

}
