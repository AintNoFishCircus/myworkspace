package leihger�teVerwaltung;

public class Leihger�t {

	private String strSerial;
	private String strIMEI;
	private String strModell;
	private String strFarbe;
	private boolean bolVerliehen;
	private double dblPreis;
	private Leihger�t next;
	
	
	
	public Leihger�t(String strSerial, String strIMEI, String strModell, String strFarbe ) {
		this.setStrSerial(strSerial);
		this.setStrIMEI(strIMEI);
		this.setStrModell(strModell);
		this.setStrFarbe(strFarbe);
		this.setBolVerliehen(false);
	}
	



	public String getStrSerial() {
		return strSerial;
	}



	public void setStrSerial(String strSerial) {
		this.strSerial = strSerial;
	}



	public String getStrIMEI() {
		return strIMEI;
	}



	public void setStrIMEI(String strIMEI) {
		this.strIMEI = strIMEI;
	}



	public String getStrModell() {
		return strModell;
	}



	public void setStrModell(String strModell) {
		this.strModell = strModell;
	}



	public String getStrFarbe() {
		return strFarbe;
	}



	public void setStrFarbe(String strFarbe) {
		this.strFarbe = strFarbe;
	}



	public boolean isBolVerliehen() {
		return bolVerliehen;
	}



	public void setBolVerliehen(boolean bolVerliehen) {
		this.bolVerliehen = bolVerliehen;
	}



	public double getDblPreis() {
		return dblPreis;
	}



	public void setDblPreis(double dblPreis) {
		this.dblPreis = dblPreis;
	}




	public Leihger�t getNext() {
		return next;
	}




	public void setNext(Leihger�t next) {
		this.next = next;
	}
	
	
	
	
}
