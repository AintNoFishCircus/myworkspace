package queuestruktur;

public class Queue {
	
	private int size;
	private int head;    //Element das als nächstes ausgelesen wird
	private int tail;	// Stelle die als nächstes bechrieben wird
	private int counter;
	private int [] queue;

	public Queue(int size){
		setSize(size);
		head = 0;
		tail = 0;
		counter = 0;
		queue = new int [size];
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getHead(){
		return head;
	}
	
	public void setHead(int head){
		this.head = head;
	}
	
	public int getTail() {
		return tail;
	}
	
	public void setTail(int tail) {
		this.tail = tail;
	}
	
	public int getCounter(){
		return this.counter;
	}
	
	public void setCounter(int counter){
		this.counter = counter;
	}
	
	public void enqueue(int x){
		if ( counter == size){
			System.out.println("Queue Overflow");
		}else{
		queue[tail] = x;
		tail++;
		counter ++;
		}
		
		if (tail == size){
			setTail(0);
		}
	}
	
	public int dequeue(){
		if (counter == 0){
			System.out.println("Queue is empty");
			return -1;
		}else{
		int x = 0;
		x = queue[head];
		head++;
		counter --;
		if (head == size){
			setHead(0);
		}
		return x;
		}
			
	
	}
	
	
}
	
	
