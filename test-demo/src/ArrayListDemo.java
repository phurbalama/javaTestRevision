import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<>(5);
		
		for(int i = 1; i < 6;i++) {
			//add integer to arraylist
			arrayList.add(i);
		}
		
		System.out.println(arrayList);
		//remove element at index 4
		arrayList.remove(4);
		
		System.out.println(arrayList);
		
		for(int i =0;i<arrayList.size();i++)
		{	//gets the elements
			System.out.print(arrayList.get(i)+" ");
		}
		//enhanced for loop
		for(int i : arrayList) {
			System.out.println(i);
		}
		
	}

}
