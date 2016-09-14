package nodelist;

public class Nodelist {
	private Node head;
	private Node tail;
	private Node it;
	
	
	public Nodelist(){
		head = null;
		tail = null;
		it = null;
	}
	
	public void reset (){
		this.head = null;
		this.tail = null;
		this.it = null;
	}
	
	public void add(int number){
		Node n = new Node();
		n.setNumber(number);
		if(head == null){
			this.head = n;
			this.tail = n;
			this.it = tail;	
		}else{
			Node tmpNode = head;
			tmpNode.setNext(n);
			n.setPrevious(tmpNode);
			head = n;
		}
	}
	
	public void delete(){
		if (head == null){
			System.out.println("Bereits leer!");
		}else if(head == tail){
			this.reset();
		}else{
			head = head.getPrevious();
			head.setNext(null);
		}
	}
	
	public int value(){
		if(head != null){
			return it.getNumber();
		}else{
			return -1;
		}
	}
	
	public boolean hasNext(){
		if (it.getNext() != null){
			return true;
		}else{
			System.out.println("End of List");
			return false;
		}
	}
	
	public void iterate(int i){
		if( i == 1 && this.hasNext()){
			it = it.getNext();
		}else if(i == -1 && it.getPrevious()!= null){
			it = it.getPrevious();
		}
	}

}
