import java.io.*;

public class TheTypingMonkey {

	public static void main(String[] args) throws IOException{
		String eingabe;
		String zufallswort;
		int count = 97;
		char [] buchstabenliste = new char [26];
		char [] auswahl = new char [3];
		int versuche = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		for (int i = 0; i < buchstabenliste.length; i ++) {
			buchstabenliste[i] = (char) count;
			count ++;
		}
		
	//	for (int i = 0; i < buchstabenliste.length; i++) {
		//	System.out.println(buchstabenliste[i]);
		//}
		
		System.out.println("Geben Sie ein Wort mit drei Buchstaben ein: ");
		eingabe = br.readLine();
		
		do {
			versuche ++;
			System.out.println("Benutzereingabe: " + eingabe);
			for (int i = 0; i < auswahl.length; i ++) {
				int pick = (int)(Math.random()*26);
				auswahl[i] = buchstabenliste[pick];
			}
		zufallswort = new String(auswahl);
		System.out.println("Zufallswort: " + zufallswort);
		
		}while(!zufallswort.equals(eingabe));
		
		System.out.println("Anzahl der Versuche: " + versuche);
	}

}
