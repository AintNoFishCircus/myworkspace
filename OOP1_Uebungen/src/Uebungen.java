
public class Uebungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GGT(24,14));
		System.out.println(GGT2(9,30));
		insertionsort();

	}
	
	public static int GGT(int p, int q) {		//Groe�ter gemeinsamer Teiler
		int r;
		
		if (q > p) {
			r = q;
			q = p;
			p = r;
		}
		while(q != 0){
			r = p % q;
			p = q;
			q = r;
		}
		return p;	
	}



	public static int GGT2(int m, int n){	

		while (m != n){
			if (m > n){
				m -= n;
			}else{
				n -= m;
			}
		}
		return m;
	}

	public static void insertionsort(){
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