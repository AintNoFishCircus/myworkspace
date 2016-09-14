package ringlist;

public class List {
	
	private Node head;
	private Node tail;
	
	
	public List() {
		setHead(null);
		setTail(null);
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void init() {
		setHead(null);
		setTail(null);
	}
	
	public void add(int number){
		Node e = new Node();
		e.setNumber(number);
		if (head == null){
			e.setNext(e);
			head = e;
			tail = e;	
		}else{
			e.setNext(head.getNext());
			head.setNext(e);
			tail = head;
			head = e;
		}
	}
	
	public void delete(){
		if(head == null)
			return;
		if(head == tail){
			head = null;
			tail = null;
		}else{
			tail.setNext(head.getNext());
			head = head.getNext();
		}
	}
	
	public int value(){
		if (head == null){
			return -1;
		}else{
			return head.getNumber();
		}
	}
	
	public void iterate(){
		if (head != null){
			tail = head;
			head = head.getNext();
		}
	}

}
