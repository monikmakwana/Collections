import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"B");
		al.add("Z");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.set(3,"D"));
		System.out.println(al);
		System.out.println(al.indexOf("Z"));
		al.add("A");
		al.add(3,"B");
		System.out.println(al);		

	}

}
