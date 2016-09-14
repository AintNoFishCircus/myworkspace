package fakultaet;


public class Fakultaet {

	public static void main (String [] args){
		
		System.out.println(berechneFak(-4));
		
	}
	
	
	public static int berechneFak(int x){
		int fak = x;
		if (fak == 0){
			return 1;
		}else if (fak < 0 ){
			return -1;
		}else{
			for (int i = fak -1; i > 0; i--){
				fak *= i;
			}
			
			return fak;
		}
	}
}
