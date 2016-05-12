package common.Aufträge;

import GUIController.MouseRobot;

public interface AuftragInterface extends Comparable<AuftragInterface>{
	
	public void run(MouseRobot robot);
	
	public boolean check();
	public int getPriority();

	public void setPriority(int priority) ;
	
	public long getTime();
	public void setTime(long time);
	


}
