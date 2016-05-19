package beleg;

public class Hauptklasse {

	public static void main(String[] args) {
		
		System.out.println(">>Erzeuge 2 Belege<<");
		Beleg b1 = new Beleg("Einzahlung", 250.50);
		Beleg b2 = new Beleg("Auszahlung", 40.00);
		b1.zeigeAn();
		b2.zeigeAn();
		
	

	}

}
