package stapelspeicher;

public class Stapel {

	private int size;
	private int tos;
	String stack [];
	
	public Stapel(int size){
		this.size=size;
		stack = new String[size];
		tos = 0;
	}
	
	public void init(){
		tos = 0;
	}
	
	public void push(String i){
		if(tos == size){
			System.out.println("Stack Overflow");
		}else{
		stack[tos]= i;
		tos++;
		}
	}
	public String pop(){
		if (tos == 0){
			System.out.println("Stack is empty");
			return "-1";
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
	public void flushStack(){
		if(!isEmpty()){
			while(tos >= 0){
			System.out.println(stack[tos]);
			tos--;
			}
		
		}else{
			
		}
	}
}
