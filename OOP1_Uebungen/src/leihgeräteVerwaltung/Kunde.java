package leihgeräteVerwaltung;

public class Kunde {

private long lngKundennummer;
private String strName;
private String strVoname;
private String strStrasse;
private int intHausNr;
private String strPLZ;
private String strOrt;
private String strTelefon;
private String strMobil;
private String strMail;
private Kunde next;

public Kunde(long lngKundennummer, String strName, String strVorname, String strStrasse,
		int intHausNr, String strPLZ, String strOrt){
	this.setLngKundennummer(lngKundennummer);
	this.setStrName(strName);
	this.setStrVoname(strVorname);
	this.setStrStrasse(strStrasse);
	this.setIntHausNr(intHausNr);
	this.setStrPLZ(strPLZ);
	this.setStrOrt(strOrt);
	
}

public long getLngKundennummer() {
	return lngKundennummer;
}

public void setLngKundennummer(long lngKundennummer) {
	this.lngKundennummer = lngKundennummer;
}

public String getStrName() {
	return strName;
}

public void setStrName(String strName) {
	this.strName = strName;
}

public String getStrVoname() {
	return strVoname;
}

public void setStrVoname(String strVoname) {
	this.strVoname = strVoname;
}

public String getStrStrasse() {
	return strStrasse;
}

public void setStrStrasse(String strStrasse) {
	this.strStrasse = strStrasse;
}

public int getIntHausNr() {
	return intHausNr;
}

public void setIntHausNr(int intHausNr) {
	this.intHausNr = intHausNr;
}

public String getStrPLZ() {
	return strPLZ;
}

public void setStrPLZ(String strPLZ) {
	this.strPLZ = strPLZ;
}

public String getStrOrt() {
	return strOrt;
}

public void setStrOrt(String strOrt) {
	this.strOrt = strOrt;
}

public String getStrTelefon() {
	return strTelefon;
}

public void setStrTelefon(String strTelefon) {
	this.strTelefon = strTelefon;
}

public String getStrMobil() {
	return strMobil;
}

public void setStrMobil(String strMobil) {
	this.strMobil = strMobil;
}

public String getStrMail() {
	return strMail;
}

public void setStrMail(String strMail) {
	this.strMail = strMail;
}

public Kunde getNext() {
	return next;
}

public void setNext(Kunde next) {
	this.next = next;
}




}
