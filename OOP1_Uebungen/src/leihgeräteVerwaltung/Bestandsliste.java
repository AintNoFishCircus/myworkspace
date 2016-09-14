package leihgeräteVerwaltung;

public class Bestandsliste {

	private Leihgerät head;
	private Leihgerät tail;
	private Leihgerät it;
	static int length;
	
	public Bestandsliste(){
		this.setHead(null);
		this.setTail(null);
		this.setIt(null);
		length = 0;
	}

	public Leihgerät getHead() {
		return head;
	}

	public void setHead(Leihgerät head) {
		this.head = head;
	}

	public Leihgerät getTail() {
		return tail;
	}

	public void setTail(Leihgerät tail) {
		this.tail = tail;
	}

	public Leihgerät getIt() {
		return it;
	}

	public void setIt(Leihgerät it) {
		this.it = it;
	}
	
	public void init(){
		this.setHead(null);
		this.setTail(null);
		this.setIt(null);
		length = 0;
	}
	
	public void add(String strSerial, String strIMEI, String strModell, String strFarbe){
		Leihgerät l = new Leihgerät(strSerial, strIMEI, strModell, strFarbe);
		if (head == null){
			l.setNext(l);
			this.head = l;
			this.tail = l;
			this.it = tail;
			length += 1;
		}else{
			l.setNext(head.getNext());
			head.setNext(l);
			tail = head;
			head = l;
			length += 1;
			
		}
	}
	
	public void delete(){
		if (head == null){
			System.out.println("kein Bestand");
		}else if(head == tail){
			this.init();
		}else{
			tail.setNext(head.getNext());
			head = head.getNext();
			length -= 1;
		}
	}
	
	public String print(){
		if (head == null){
			return "kein Bestand";
		}else{
			String s = "\n" + "S/N: " + "\t" + head.getStrSerial().toString() + "\n" +
						"IMEI:" + "\t"+ head.getStrIMEI().toString()
						+ "\n" + "Modell:" + "\t" + head.getStrModell().toString() 
						+ "\n" + "Farbe: " + "\t" + head.getStrFarbe().toString()
						+ "\n" + "verliehen?: " + head.isBolVerliehen();
			return s;
		}
	}
	
	public void iterate(){
		if(head != null){
			tail = head;
			head = head.getNext();
		}
	}
	
	public int showLength(){
		return length;
	}
	
	
}
