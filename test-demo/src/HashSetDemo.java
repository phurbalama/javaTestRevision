import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		
		//adds value to sets and rejects duplicate and returns boolean value
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");
		System.out.println(hashSet);
		// checks whether value exist and returns boolean value
		System.out.println("List contains C or not?" + hashSet.contains("C"));
		
		hashSet.remove("A");
		System.out.println("Set after removing A: " + hashSet);
		
		
		for(String i : hashSet)
			System.out.println(i);
	}

}
