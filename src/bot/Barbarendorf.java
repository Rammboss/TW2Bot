package bot;
/**
 * Diese Klasse repräsentiert Ein Barbarendorf
 * @author Effi
 *
 */
public class Barbarendorf extends Dorf {
	
	private long letzterAngriff;

	protected Barbarendorf(int x, int y) {
		super(x, y, "Barbarendorf");
	}

	public long getLetzterAngriff() {
		return letzterAngriff;
	}

	public void setLetzterAngriff(long letzterAngriff) {
		this.letzterAngriff = letzterAngriff;
	}

}
