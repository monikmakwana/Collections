import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s=new Stack();
		s.add("A");
		s.add("B");
		System.out.println(s);
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.empty());

	}

}
