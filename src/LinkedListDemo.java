import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("Monik");
		l.add(10);
		l.add(null);
		l.add("Monik");
		System.out.println(l);
		l.set(1,"IT");
		System.out.println(l);
		l.add(0,"Linux");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Computer");
		System.out.println(l);
		
	}

}
