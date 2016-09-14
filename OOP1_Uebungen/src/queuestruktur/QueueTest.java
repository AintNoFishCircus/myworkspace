package queuestruktur;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue schlange = new Queue(5);
		
		schlange.enqueue(1);
		schlange.enqueue(2);
		schlange.enqueue(3);
		schlange.enqueue(4);
		schlange.enqueue(5);
		schlange.enqueue(77);
		System.out.println(schlange.dequeue());
		System.out.println(schlange.dequeue());
		System.out.println(schlange.dequeue());
		System.out.println(schlange.dequeue());
		schlange.enqueue(6);
		System.out.println(schlange.dequeue());
		System.out.println(schlange.dequeue());
		schlange.enqueue(7);
		System.out.println(schlange.dequeue());
		System.out.println(schlange.dequeue());
	}

}
