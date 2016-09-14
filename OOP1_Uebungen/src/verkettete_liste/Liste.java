package verkettete_liste;

public class Liste {
public Element head; //
public Element tail; //
public Element it;

public Liste(){
	head = null;
	tail = null;
	it = null;
}

public void init(){
	head = null;
	tail = null;
	it = null;
}

public void add (int i){
	Element e = new Element();
	e.no = i;
	if (head == null) {
	head = e;
	tail = e;
	it = tail;
}else {
	Element x = head;
	e.previous = x;
	x.next = e;
	head = e;
}
}
	
public int value() {
	if(head != null){
		return it.no;
	}else{
		return -1;
	}
}

public void delete() {
	if (head == null){
		System.out.println("bereits leer");
	}else if(head == tail){
		this.init();
	}else{
		head=head.previous;
		head.next = null;
	}
}

public void iterate(int x){
	if(x == 1 &&it.next!=null){
		it=it.next;
	}else if(x == -1 && it.previous!= null){
		it = it.previous;
	}
}

public void resetIterator(){
	it = tail;
}


}



