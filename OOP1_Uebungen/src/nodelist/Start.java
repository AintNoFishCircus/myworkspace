package nodelist;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nodelist list = new Nodelist();
		list.add(13);
		System.out.println(list.value());
		list.delete();
		System.out.println(list.value());
		list.add(12);
		list.add(4);
		list.add(76);
		System.out.println(list.value());
		list.iterate(1);
		System.out.println(list.value());
		list.iterate(1);
		System.out.println(list.value());
		list.iterate(1);
		list.iterate(-1);
		list.iterate(-1);
		list.iterate(-1);
		System.out.println(list.value());
		list.iterate(-1);
		System.out.println(list.value());
		list.iterate(-1);
		System.out.println(list.value());


	}

}
