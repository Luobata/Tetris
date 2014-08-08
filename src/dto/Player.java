package dto;

public class Player {

	private String naeme;
	private int point;
	public String getNaeme() {
		return naeme;
	}
	public void setNaeme(String naeme) {
		this.naeme = naeme;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Player(String naeme, int point) {
		super();
		this.naeme = naeme;
		this.point = point;
	}
}
