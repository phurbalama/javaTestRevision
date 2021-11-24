import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		//adds elemnts to map with unique key and value
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		//size of the map
		System.out.println("Size : " + map.size());
		
		System.out.println(map); 
		//checks if it contains the key
		if(map.containsKey("c")) {
			Integer a = map.get("c");
			System.out.println("The value of \"c\" is "+ a);
		}
		
		//iterating through hash map through key using enchanced forloop
		for(String key: map.keySet()) {
			System.out.println("Key: "+ key + ", Value: "+ map.get(key));
		}
		
		//using Entry set to iterate through hash map
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey()+ ", Value: "+ entry.getValue());
		}
		
		
	}

}
  