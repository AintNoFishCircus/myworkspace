package beleg;

public class Beleg {

	private String betreff;
	private double betrag;
	private int belegnr;
	public static int zaehler;
	
	public Beleg(String betreff, double betrag){
		setBetreff(betreff);
		setBetrag(betrag);
		zaehler++;
		setBelegnr(1000 + zaehler);
	}

	public String getBetreff() {
		return betreff;
	}

	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	
	public int getBelegnr() {
		return belegnr;
	}

	public void setBelegnr(int belegnr) {
		this.belegnr = belegnr;
	}
	
	public void zeigeAn(){
		System.out.println("Betreff: " + betreff);
		System.out.println("Betrag: " + betrag);
		System.out.println("BelegNr: " + belegnr);
	}

	
}
