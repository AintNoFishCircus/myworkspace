package stack;

public class Stack {
	
	private int size;
	private int tos;
	private int [] stack;
	
	public Stack(int size){
		this.setSize(size);
		stack = new int [size];
		setTos(0);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTos() {
		return tos;
	}

	public void setTos(int tos) {
		this.tos = tos;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}
	
	public void reset(){
		if (tos == 0){
			System.out.println("Stack is already empty");
		}else{
		setTos(0);
		}
	}
	
	public void push(int number){
		if(tos == size){
			System.out.println("Stack Overflow");
		}else{
			stack[tos] = number;
			tos++;
		}
	}
	
	public int pop(){
		if(tos == 0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			tos--;
			return stack[tos];
		}
	}
	
	public boolean isEmpty(){
		if (tos == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void flush(){
		if (!isEmpty()){
			while (tos > 0){
				System.out.println(pop());
			}
		}else{
			System.out.println("Stack is empty");
		}
	}
	

}
