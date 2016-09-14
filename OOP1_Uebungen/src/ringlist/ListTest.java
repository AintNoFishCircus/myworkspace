package ringlist;

public class ListTest {
	
	public static void main (String [] args){
	
	List list = new List();
	
	list.add(1);
	list.add(2);
	System.out.println(list.value());
	list.iterate();
	System.out.println(list.value());
	list.iterate();
	System.out.println(list.value());
	list.add(5);
	System.out.println(list.value());
	list.delete();
	System.out.println(list.value());
	list.iterate();
	System.out.println(list.value());
	list.iterate();
	System.out.println(list.value());
	list.init();
	list.iterate();
	System.out.println(list.value());
	
	
	
	}
	
}
