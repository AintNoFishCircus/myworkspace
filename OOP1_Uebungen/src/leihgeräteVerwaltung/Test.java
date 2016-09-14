package leihgeräteVerwaltung;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bestandsliste b = new Bestandsliste();
		
		b.add("C36JCCK2DTWD", "013352009837980", "iPhone 5, 16GB", "black");
		b.add("F78MM7XAFFT7", "358830050178555", "iPhone 5c, 16GB", "blue" );
		
		System.out.println(b.print());
		b.iterate();
		System.out.println(b.print());
		System.out.println(b.showLength());
	}

}
