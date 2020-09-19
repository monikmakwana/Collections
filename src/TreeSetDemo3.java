import java.util.*;
public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparatorr());
		t.add("Monik");
		t.add("Raj");
		t.add("Vijay");
		t.add("Ronak");
		t.add("Manan");
		System.out.println(t);
		

	}
}

class MyComparatorr implements Comparator
{
	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}

