package sample.doc;

public class salary {
	private double Basics;
	private double pf;
	private double gross;
	private double da;
	private double net;
	
	public double getBasics() {
		return Basics;
	}
	public void setBasics(double basics) {
		Basics = basics;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return "salary [Basics=" + Basics + ", pf=" + pf + ", gross=" + gross + ", da=" + da + ", net=" + net + "]";
	}
	
	
	

}
