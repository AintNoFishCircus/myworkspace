package leihgeräteVerwaltung;

public class Kundenliste {
	

		  private Kunde head;
		  private Kunde tail;
		  static int length = 0;

		  public Kunde getHead(){
		    return head;
		  }

		  public void setHead(Kunde k){
		    head = k;
		  }

		  public Kunde getTail(){
		    return tail;
		  }

		  public void setTail(Kunde k){
		  tail = k;
		  }

		  public Kundenliste() {
		    this.setHead(null);
		    this.setTail(null);
		    length = 0;
		  }
		  
		  public void init() {
		    this.setHead(null);
		    this.setTail(null);
		  }
		  
		  public void add(long lngKundennummer, String strName, String strVorname, String strStrasse,
					int intHausNr, String strPLZ, String strOrt) {
		    Kunde k = new Kunde( lngKundennummer,  strName,  strVorname, strStrasse,
		    					 intHausNr, strPLZ,  strOrt);
		    if(head == null){
		    k.setNext(k);
		    this.head = k;
		    this.tail = k;
		    length += 1;
		    }else{
		    k.setNext(head.getNext());
		    head.setNext(k);
		    tail = head;
		    head = k;
		    length += 1;
		    }
		  }
		  
		  public void delete(){
		    if(head == null){
		      
		    }else if(head == tail){
		      this.init();
		    }else{
		      tail.setNext(head);
		      head = head.getNext();
		      length -= 1;
		    }
		  
		  }
		  
		  public void iterate(){
		  if (head != null){
		  tail = head;
		  head = head.getNext();
		  }
		  }


}

