package Primjeri;

import java.util.Arrays;
import java.util.List;

public class upperWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(3, 5, 7, 9);
		List<Double> doubleList = Arrays.asList(7.4, 6.7, 3.5, 7.8);
		
		System.out.println("Sum of " + intList.toString() + " is " + sumOfNums(intList));
		System.out.println("Sum of " + doubleList.toString() + " is " + round(sumOfNums(doubleList), 2));
	}

	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

	private static double sumOfNums(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list)
			sum += n.doubleValue();
		return sum;
	}

}
