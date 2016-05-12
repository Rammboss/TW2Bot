package bot;
/**
 * Diese Klasse repr�sentiert Ein Barbarendorf
 * @author Effi
 *
 */
public class Babarendorf extends Dorf {
	
	private long letzterAngriff;

	public Babarendorf(int x, int y) {
		super(x, y, "Barbarendorf");
	}

	public long getLetzterAngriff() {
		return letzterAngriff;
	}

	public void setLetzterAngriff(long letzterAngriff) {
		this.letzterAngriff = letzterAngriff;
	}

}
