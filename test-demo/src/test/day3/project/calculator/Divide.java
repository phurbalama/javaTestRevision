package test.day3.project.calculator;

public class Divide implements Operate {

	@Override
	public Double getResult(Double... numbers) {
		// TODO Auto-generated method stub
		Double result = numbers[0];
		
		for(int i =1; i< numbers.length;i++)
		{
			result/= numbers[i];
		}
		return result;
	}

}
