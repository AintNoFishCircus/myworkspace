package rechnerzeit;

public class Zeitmesser {

	
	private int startwert;
	private long endwert;
	
	public Zeitmesser(int startwert, int endwert){
		setStartwert(startwert);
		setEndwert(endwert);
	}

	public int getStartwert() {
		return startwert;
	}

	public void setStartwert(int startwert) {
		this.startwert = startwert;
	}

	public long getEndwert() {
		return endwert;
	}

	public void setEndwert(int endwert) {
		this.endwert = endwert;
	}
	
	public void messeZeit(){
		long startzeit = System.currentTimeMillis();
		long endzeit = 0;
		for (int i = startwert; i <= endwert; i++){
			
		}
		endzeit = System.currentTimeMillis();
		 
		System.out.println("Laufzeit: " + (endzeit - startzeit) + " Millisekunden");
	}
	
	
	
}
