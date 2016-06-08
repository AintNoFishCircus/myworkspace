package konto;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto kto1 = new Konto("Hans Müller", 123456, 500.00);
		Konto kto2 = new Konto("Peter Krause", 456789, 250.00);
		Konto kto3 = new Konto(37954);
		kto1.verzinse();
		kto3.verzinse();
		anzeigen(kto1);
		anzeigen(kto2);
		anzeigen(kto3);
	}

	public static void anzeigen(Konto kto){
		System.out.println("Kontoinhaber: " + kto.getKontoinhaber());
		System.out.println("Kontonummer: " + kto.getKontonummer());
		System.out.println("Saldo: " + kto.getSaldo());
		System.out.println("Zinssatz: " + kto.getZinssatz());
		System.out.println("");

	}
}
