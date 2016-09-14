package stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.isEmpty());
		stack.flush();
		System.out.println(stack.isEmpty());
		stack.flush();
		
	}

}
