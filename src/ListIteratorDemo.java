import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("Monik");
		l.add("Raj");
		l.add("Raman");
		l.add("Manan");
		l.add("Kanan");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Raman"))
				ltr.remove();
			else if(s.equals("Manan"))
				ltr.add("Mohit");
			else if(s.equals("Kanan"))
				ltr.set("Kamal");			
		}
		
		System.out.println(l);

	}
}