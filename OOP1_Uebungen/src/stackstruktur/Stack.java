package stackstruktur;

public class Stack {

	private int size;
	private int tos;
	private int [] stack;
	
	
	public Stack (int size) {
		this.setSize(size);
		tos = 0;
		stack = new int[size];
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
	
	public void resetStack(){
		tos = 0;
	}
	
	public void push(int x){
		
		if(tos == size){
			System.out.println("Stack Overflow");
		}else{
			stack[tos] = x;
			tos++;
		}
	}
	
	public int pop(){
		
		if(tos == 0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			tos --;
			return stack[tos];
		}
	}
	
	public int peek(){
		
		if(tos == 0){
			System.out.println("Empty Stack");
			return -1;
		}else{
			System.out.print("Next value is: ");
			return stack[tos-1];
		}
	}
}
