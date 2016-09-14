package kundenliste;

public class Kundenliste {

	private Kunde head;
	private Kunde tail;
	private Kunde iterator;
	
	public Kundenliste() {
		this.head = null;
		this.tail = null;
		this.iterator = null;
		
	}
	
	
	
	public Kunde getHead() {
		return head;
	}



	public void setHead(Kunde head) {
		this.head = head;
	}



	public Kunde getTail() {
		return tail;
	}



	public void setTail(Kunde tail) {
		this.tail = tail;
	}



	public Kunde getIterator() {
		return iterator;
	}



	public void setIterator(Kunde iterator) {
		this.iterator = iterator;
	}



	public void reset() {
		this.head = null;
		this. tail = null;
		this.iterator = null;
	}
	
	public void add(String name, String vorname, String strasse, String ort, String plz){
		Kunde kunde = new Kunde(name, vorname, strasse, ort, plz);
		if (head == null){
			head = kunde;
			tail = kunde;
			iterator = tail;
		}else{
			Kunde puffer = head;
			kunde.setPrevious(puffer);
			puffer.setNext(kunde);
			head = kunde;
		}
	}
	
	public void delete(){
		if (head == null){
			System.out.println("List is already empty");
		}else if (head == tail){
			System.out.println("Customer deleted: " + iterator.getKundennummer() );
			this.reset();
		}else{
			System.out.println("Customer deleted: " + head.getKundennummer() );
			this.head = head.getPrevious();
			head.setNext(null);
		}
	}
	
	public String toString(){
		if (head != null){
			String string = new String ("KundenNr: " + "\t" + iterator.getKundennummer() + "\n" + "Nachname: " + "\t" + iterator.getName()
			+ "\n" + "Vorname: " + "\t" + iterator.getVorname());
			return string;
		}else{
			return "List is empty";
		}
	}
	
	public void iterate(int n){
		if(n == -1 && iterator.getPrevious()!= null){
			iterator = iterator.getPrevious();
		}else if(n == 1 && iterator.getNext()!= null){
			iterator = iterator.getNext();
		}
	}
}
