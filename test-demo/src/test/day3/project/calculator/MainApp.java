package test.day3.project.calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
	
	public static void main(String[] args) {
		final String inputExp = ReadInput.read();
		
		Queue<String> operations;
		Queue<String> numbers;
		
		//using split to store numbers only to numbersArray
		String numbersArr[] = inputExp.split("[-+*/]");
		//using split to store only operations in operation Array
		String operArr[] = inputExp.split("[0-9]+");
		
		//using Arrays.asList to convert string array to a list and then List to a linkedList and storing as a QUEUE
		numbers = new LinkedList<String>(Arrays.asList(numbersArr));
		operations = new LinkedList<String>(Arrays.asList(operArr));
		
		//poll fetches first element
		Double res = Double.parseDouble(numbers.poll());
		
		//until the numbers queue is emtpy loop will continue
		while(!numbers.isEmpty()) {
			//store first operation in opr
			String opr = operations.poll();
			
			Operate operate;
			//selects the operator from the queue and choose the class based on operation
			switch(opr) {
			case "+":
				operate = new Add();
				break;
			case "-":
				operate = new Subtract();
				break;
			case "/":
				operate = new Divide();
				break;
			case "*":
				operate = new Multiply();
				break;
			default:
				continue;
			
			}
			
			//gets the next number from queue
			Double num = Double.parseDouble(numbers.poll());
			//calculates the number using its operation and stores it
			res = operate.getResult(res,num);
			
			
			
		}
		
		System.out.println(res);
	}

}
