package bot;

import java.awt.Point;

import settings.Utils;

public abstract class Dorf {

	private Point position;
	private String name;

	public Dorf(int x, int y, String n) {

		this.position = new Point(x, y);
		this.name = n;
	}
	public Dorf(int x, int y) {
		this.position = new Point(x, y);
		this.name = "Default";
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getDistance(){
		return Math.sqrt(Math.pow(this.getPosition().getX() - Utils.CURRENT.getPosition().getX(), 2)
					   + Math.pow(this.getPosition().getY() - Utils.CURRENT.getPosition().getY(), 2));
	}

}
