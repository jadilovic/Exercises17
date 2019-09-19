package Primjeri;

import java.util.Arrays;
import java.util.List;

public class unboundedWildCardP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ints = Arrays.asList(1, 3, 5);
		List<String> strs = Arrays.asList("one", "three", "five");
		
		listObject(ints);
		listObject(strs);
	}

	private static void listObject(List<?> object) {
		// TODO Auto-generated method stub
		for(Object demo: object)
			System.out.print(demo + " ");
	}

}
