package test.day3.enums;

enum Color {
		RED("red"),GREEN("green"),BLUE("blue");
	
	private String value;
	
	Color(String val){
		this.value = val;
	}
	
	public String getValue() {
		return this.value;
	}
}
