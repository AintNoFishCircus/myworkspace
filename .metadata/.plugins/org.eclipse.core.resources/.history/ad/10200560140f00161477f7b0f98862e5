
public class Insertionsort {
	public static void main (String [] args){
		int [] liste = new int [10]; 			// Deklaration Variablen
		int puffer = 0;
		int i,j,k;
		
		for (i = 0; i < liste.length; i++){
			liste[i] = (int) (Math.random() * 100); // Initialisierung Array
			System.out.print(liste[i] + ", ");
		}
		for (j = 1; j < liste.length; j++){	
			puffer = liste[j];			// Übergabe des zu sortierenden Wertes in den puffer
			for(k = j; k > 0 && liste[k-1] > puffer; k--){
				liste[k] = liste[k-1]; 		
			}
			liste[k] = puffer;				
		}
		for(i = 0; i < liste.length; i++){
		System.out.println(liste[i]);
		}
	}

}
