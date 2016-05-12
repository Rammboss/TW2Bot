package common.Aufträge;

import GUIController.MouseRobot;
import common.AuftragInterface;

public abstract class Auftrag implements AuftragInterface {

	private int priority;
	

	public Auftrag(int p) {

		this.priority = p;

	}

	@Override
	public abstract void run(MouseRobot robot);

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}
