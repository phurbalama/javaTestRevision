import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		//adds the data and sorts it
		treeSet.add("D");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("A");
		
		System.out.println(treeSet);
	}

}
