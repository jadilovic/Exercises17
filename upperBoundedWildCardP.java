package Primjeri;

import java.util.Arrays;
import java.util.List;

public class upperBoundedWildCardP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		List<Double> doubleList = Arrays.asList(2.4, 5.6, 7.8);
		
		sumOfNums(intList);
		sumOfNums(doubleList);
		
	}

	private static void sumOfNums(List<? extends Number> list) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(Number o: list)
			sum += o.doubleValue();
		System.out.println("Sum of is " + sum);
	}

}
