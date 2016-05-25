package bot;

import java.awt.Point;

public abstract class Dorf {

	private Point position;
	private String name;

	public Dorf(int x, int y, String n) {

		this.position = new Point(x, y);
		this.name = n;

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

}
