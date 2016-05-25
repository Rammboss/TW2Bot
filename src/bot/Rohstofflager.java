package bot;

public class Rohstofflager extends Dorf {
	
	private long checked;

	public Rohstofflager(int x, int y, String n) {
		super(x, y, n);
		checked = 0;
		
	}

	public long getChecked() {
		return checked;
	}

	public void setChecked(long checked) {
		this.checked = checked;
	}

}
