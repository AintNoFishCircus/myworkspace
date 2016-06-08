package konto;

public class Konto {

	private String kontoinhaber;
	private long kontonummer;
	private double saldo;
	private double zinssatz;
	
	public Konto(String kontoinhaber,int kontonummer, double saldo){
		setKontoinhaber(kontoinhaber);
		setKontonummer(kontonummer);
		setSaldo(saldo);
		setZinssatz(0.1);
	}
	public Konto(int kontonummer){
		setKontonummer(kontonummer);
	}


	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}

	public long getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(long kontonummer) {
		this.kontonummer = kontonummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double getZinssatz() {
		return zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		this.zinssatz = zinssatz;
	}

	public void einzahlen(double betrag){
		saldo += betrag;
	}
	
	public boolean auszahlen(double betrag){
		if (betrag > saldo){
			System.out.println("Nicht genügend Guthaben");
			return false;
		}else{
			saldo -= betrag;
			return true;
		}
	}
	public boolean ueberweisen(Konto zielkonto, double betrag){
		if(this.auszahlen(betrag)){
			zielkonto.einzahlen(betrag);
			return true;
		}else{
			System.out.println("Nicht genügend Guthaben");
			return false;
			
		}
	}
	public void verzinse(){
		saldo = saldo * (zinssatz +1);
	}
	
}
