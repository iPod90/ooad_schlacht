package kaempfer;

import ausruestung.*;

public abstract class Kaempfer {
	protected int gesundheit;
	protected int geschick; // 0<=geschick=>10
	protected int sold;
	
	
	
	
	public Kaempfer(int gesundheit, int geschick, int sold) {
		super();
		this.gesundheit = gesundheit;
		this.geschick = geschick;
		this.sold = sold;
	}
	public abstract int kaempfen();
	public abstract int abwehren(int angriff);
	public abstract int nimmWaffe(Waffe w);
	public abstract int nimmRuestung(Ruestung r);
	
	
	public int getGesundheit() {
		return gesundheit;
	}
	public void setGesundheit(int gesundheit) {
		this.gesundheit = gesundheit;
	}
	public int getGeschick() {
		return geschick;
	}
	public void setGeschick(int geschick) {
		this.geschick = geschick;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
}
