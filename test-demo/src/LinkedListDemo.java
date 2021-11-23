import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> list = new LinkedList<String>();
			
			list.add("A");
			list.add("B");
			list.addFirst("C");
			list.addLast("h");
			list.add(2,"g");
			
			System.out.println(list);
			
			list.remove("g");
			list.remove(0);
			list.removeFirst();
			list.removeLast();
			
			System.out.println(list);
			
			
	}

}
