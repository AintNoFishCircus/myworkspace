package student;

public class Student {
	private String name;
	private String matrikelnummer;
	private int scheine;
	
	public Student(String name, String matrikelnummer){
		setName(name);
		setMatrikelnummer(matrikelnummer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public int getScheine() {
		return scheine;
	}

	public void setScheine(int scheine) {
		this.scheine = scheine;
	}
	
	public void erhoeheAnzahlScheine(int n){
		scheine += n;
	}
	
	public void gebeAus(){
		System.out.println("Der Name lautet: " + getName());
		System.out.println("Die Matrikelnummer ist: " + getMatrikelnummer());
	}
	
 
}
