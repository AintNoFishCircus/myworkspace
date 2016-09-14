package schlange;

public class Schlange {

	private int size;
	private int head;
	private int tail;
	private int [] schlange;
	
	
	
	public Schlange(int x){
		setSize(x);
		schlange = new int[x];
		setHead(0);
		setTail(0);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int[] getSchlange() {
		return schlange;
	}
	public void setSchlange(int[] schlange) {
		this.schlange = schlange;
	}
	
	public void init(){
		setHead(0);
		setTail(0);
	}
	
	public void put(int x){
		if (tail != 0 && head == tail){
			System.out.println("Schlangenüberlauf");
		}else if(tail == size){
			setTail(0);	
			schlange[tail] = x;
			tail++;
		}else{
			schlange[tail] = x;
			tail ++;
			
		}
	}
	
	public int get(){
		int puffer;
		if (tail == 0){
			System.out.println("Schlangenunterlauf");
			puffer = -1;
		}else if (head == size){
			setHead(0);
			puffer = schlange[head];
			head ++;	
		}else{
			puffer = schlange[head];
			head++;
		}
		return puffer;
	}
	
	
}
