package schlange;

public class SchlangeTest {

	public static void main (String [] args){
		
		Schlange schlange = new Schlange(5);
		
		schlange.put(1);
		schlange.put(2);
		schlange.put(3);
		schlange.put(4);
		schlange.put(5);
		schlange.put(6);
		System.out.println(schlange.get());
		schlange.put(7);
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		System.out.println(schlange.get());
		
		
	}
}
