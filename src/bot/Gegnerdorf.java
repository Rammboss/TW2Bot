package bot;

import javax.persistence.Column;

public class Gegnerdorf extends Dorf {
	@Column(name = "Letzter Angriff")
	private long letzterAngriff;
	
	

	public Gegnerdorf(int x, int y, String n) {
		super(x, y, n);
		// TODO Auto-generated constructor stub
	}

	public long getLetzterAngriff() {
		return letzterAngriff;
	}

	public void setLetzterAngriff(long letzterAngriff) {
		this.letzterAngriff = letzterAngriff;
	}

}
