import java.util.*;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		//t.add(new Integer(10));
		//t.add(null);
		System.out.println(t);
	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1 < i2)
			return +1;
		else if (i1>i2)
			return -1;
		else
			return 0;
	}
	
}

