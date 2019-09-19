package Primjeri;

import java.util.ArrayList;
import java.util.List;

public class legacyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List legacy = new ArrayList<>();
		legacy.add("old");
		legacy.add(1);
		legacy.add(new Object());
		
		for(Object obj: legacy)
			System.out.println(obj);
		
		List<String> listString = new ArrayList<>();
		listString = legacy;
		
	//	for(String string: listString)
	//		System.out.println(string);
	}

}
