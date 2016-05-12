package common.Aufträge;

import GUIController.MouseRobot;

public interface AuftragInterface extends Comparable<AuftragInterface>{
	
	public void run(MouseRobot robot);
	public int getPriority();

	public void setPriority(int priority) ;
	


}
