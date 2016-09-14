package stapelspeicher;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stapel stapel = new Stapel(5);
		System.out.println(stapel.isEmpty());
		stapel.push("Test");
		stapel.push("ein");
		stapel.push("ist");
		stapel.push("dies");
		stapel.push("Hallo");
		

		stapel.flushStack();
	}

}
