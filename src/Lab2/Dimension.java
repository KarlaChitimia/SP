package Lab2;

public class Dimension {
	private int lungime;
	private int latime;

	public int getLungime() {
		return lungime;
	}

	public int getLatime() {
		return latime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	public Dimension(int lungime, int latime) {
		super();
		this.lungime = lungime;
		this.latime = latime;
	}
}
