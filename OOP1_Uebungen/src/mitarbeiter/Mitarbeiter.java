package mitarbeiter;

public class Mitarbeiter {

	private String name;
	private String personalnr;
	private int stundensatz;
	
	public Mitarbeiter(String name, String personalnr){
		setName(name);
		setPersonalnr(personalnr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalnr() {
		return personalnr;
	}

	public void setPersonalnr(String personalnr) {
		this.personalnr = personalnr;
	}

	public int getStundensatz() {
		return stundensatz;
	}

	public void setStundensatz(int stundensatz) {
		this.stundensatz = stundensatz;
	}
	
	public void print(){
		System.out.println("Name: " + name);
		System.out.println("PersonalNr: " + personalnr);
	}
	
	
}
