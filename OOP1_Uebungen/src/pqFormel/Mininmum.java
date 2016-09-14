package pqFormel;

public class Mininmum {

	public static void main (String [] args){
		int [] liste = new int[10];
		
		
		for (int i = 0; i < liste.length; i++){
			liste[i] = (int) (Math.random()* 100);
			System.out.println(liste[i]);
			System.out.println(" ");
		}
		
		for (int i = 0; i < liste.length; i++){
			if (liste[0] > liste[i]){
				liste[0] = liste[i];
			}
		}
		System.out.println("Die kleinste Zahl ist " + liste[0]);
		
	}
}
