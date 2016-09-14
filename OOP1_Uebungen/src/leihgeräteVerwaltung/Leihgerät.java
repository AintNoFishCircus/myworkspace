package leihgeräteVerwaltung;

public class Leihgerät {

	private String strSerial;
	private String strIMEI;
	private String strModell;
	private String strFarbe;
	private boolean bolVerliehen;
	private double dblPreis;
	private Leihgerät next;
	
	
	
	public Leihgerät(String strSerial, String strIMEI, String strModell, String strFarbe ) {
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




	public Leihgerät getNext() {
		return next;
	}




	public void setNext(Leihgerät next) {
		this.next = next;
	}
	
	
	
	
}
