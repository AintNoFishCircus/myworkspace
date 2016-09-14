package kundenliste;

public class Kunde {

	private int kundennummer;
	private String name;
	private String vorname;
	private String strasse;
	private String ort;
	private String plz;
	private Kunde previous;
	private Kunde next;
	static int counter = 1;
	
	
	public Kunde(String name, String vorname, String strasse, String ort, String plz){
		setName(name);
		setVorname(vorname);
		setStrasse(strasse);
		setOrt(ort);
		setPlz(plz);
		kundennummer +=counter;
		counter ++;
	}
	
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}

	public Kunde getPrevious() {
		return previous;
	}

	public void setPrevious(Kunde previous) {
		this.previous = previous;
	}

	public Kunde getNext() {
		return next;
	}

	public void setNext(Kunde next) {
		this.next = next;
	}
	
	
	
	
}
