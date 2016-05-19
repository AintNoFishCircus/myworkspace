package student;

public class Hauptklasse {

	public static void main(String[] args) {
		
		System.out.println(">>Erfasse neuen Student:<<");
		Student s = new Student("Hans Müller","145678");
		s.gebeAus();
		System.out.println(s.getScheine());
		System.out.println(">>Erhoehe Anzahl der Scheine um 3:<<");
		s.erhoeheAnzahlScheine(3);
		System.out.println(s.getScheine());

	}

}
