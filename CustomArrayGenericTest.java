package Primjeri;

import java.util.List;

public class CustomArrayGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> customList = new CustomArrayGeneric<>();
		customList.add("how");
		customList.add("do");
		customList.add("you");
		
		for(int i = 0; i < customList.size(); i++){
			System.out.println(customList.get(i));
		}
	}

}
