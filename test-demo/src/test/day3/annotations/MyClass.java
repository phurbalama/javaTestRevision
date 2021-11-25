package test.day3.annotations;

import java.lang.reflect.Method;

public class MyClass {
	@MarkerAnnotation(value = 10)
	public void sayHello() {
		System.out.println("my custom annotation");
	}
	public static void main(String args[]) throws Exception {
		
		MyClass h = new MyClass();
		// to fetch annotation value 
		Method methodVal = h.getClass().getMethod("sayhello");
		//gets annotation 
		MarkerAnnotation custom = methodVal.getAnnotation(MarkerAnnotation.class);
		System.out.println(custom.value());
	}
}
