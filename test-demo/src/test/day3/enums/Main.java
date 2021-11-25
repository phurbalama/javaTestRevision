package test.day3.enums;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.BLUE;
		System.out.println(color.name());
		System.out.println(color.getValue());
		
		for(Color col: Color.values()) {
			
			System.out.println(col.getValue());
		}
		
	}

}
