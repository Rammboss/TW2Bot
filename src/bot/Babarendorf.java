package bot;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Diese Klasse repräsentiert Ein Barbarendorf
 * 
 * @author Effi
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Barbarendörfer")
public class Babarendorf extends Gegnerdorf implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	public Babarendorf(int x, int y) {
		super(x, y, "Barbarendorf");
	}

	public Babarendorf(int x, int y, long gefarmed) {
		super(x, y, "Babarendorf");
		this.setLetzterAngriff(gefarmed);
	}

	public boolean farmable() {

		if (this.getLetzterAngriff() + (60 * 60 * 1000) < new Date().getTime())
			return true;
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
