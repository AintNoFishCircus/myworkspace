package stapelspeicher;

public class Stack {

	private int size;
	private int tos;
	private int [] stack; 
	
	public Stack(int s){
		size = s;
		stack = new int [size];
		tos = 0;
	}
	
	public void push(int i){
		if (tos == size){
			System.out.println("Stack Overflow");
		}else{
			stack[tos] = i;
			tos++;
		}
	}
	public int pop(){
		if (tos == 0){
			System.out.println("Stack is empty");
			return -1;
		}else{
			tos--;
			return stack[tos];
		}
	}
	public void peek(int n){
	int tmptos = tos;
	if ( tos == 0) {
		System.out.println("Stack is empty");
	}else{
		for (int i = n; i > 0; i--){
			System.out.println(stack[tos]);
		}
	}
	}}
