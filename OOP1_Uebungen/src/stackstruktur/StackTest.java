package stackstruktur;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stapel = new Stack(5);
		stapel.push(1);
		stapel.push(2);
		stapel.push(3);
		stapel.push(4);
		stapel.push(5);
		
		System.out.println(stapel.pop());
		System.out.println(stapel.pop());
		System.out.println(stapel.pop());
		System.out.println(stapel.pop());
		System.out.println(stapel.pop());
		System.out.println(stapel.pop());
		System.out.println(stapel.peek());
		stapel.push(77);
		System.out.println(stapel.peek());
	}

}
